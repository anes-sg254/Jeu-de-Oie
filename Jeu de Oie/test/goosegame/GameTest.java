package goosegame;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private ClassicalBoard board;

    @Before
    public void set() {
        board = new ClassicalBoard();
        game = new Game(board);
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        player3 = new Player("Player3");
        player4 = new Player("Player4");
    }

    @Test
    public void testAddPlayer() {
        game.addPlayer(player1);
        game.addPlayer(player2);

        assertTrue(game.getPlayers().contains(player1));
        assertTrue(game.getPlayers().contains(player2));
        assertFalse(game.getPlayers().contains(player3));
        assertFalse(game.getPlayers().contains(player4));
    }

    @Test
    public void testIndexMoving() {
        assertEquals(3, game.indexMoving(3));
        assertEquals(62, game.indexMoving(64));
    }

    @Test
    public void testMovingPlayer_NormalMove() {
        
        Cell startCell = board.getCell(0);
        player1.setCell(startCell);
        startCell.putPlayer(player1);
        game.movingPlayer(player1, 3);
        assertEquals(board.getCell(3), player1.getCell());
    }

    @Test
    public void testMovingPlayer_Bounce() {
        
        Cell startCell = board.getCell(board.getNbOfCells()- 2);
        player1.setCell(startCell);
        startCell.putPlayer(player1);
        game.movingPlayer(player1, 3);
        assertEquals(board.getCell(board.getNbOfCells()-1), player1.getCell());
    }

    @Test
    public void testMovingPlayer_WaitingCell() {
       
        Cell waitingCell =game.getBoard().getCell(19);
        Cell Cell = board.getCell(18);
        player1.setCell(Cell);
        Cell.putPlayer(player1);
        // Move the player to the waiting cell
        game.movingPlayer(player1, 1);

        // Check if the player is on the waiting cell
        assertEquals(waitingCell, player1.getCell());
    }

    @Test
    public void testMovingPlayer_TeleportationCell() {
        Cell teleportCell =game.getBoard().getCell(6);
        Cell Cell = board.getCell(5);
        player1.setCell(Cell);
        Cell.putPlayer(player1);
        // Move the player to the Teleportation cell
        game.movingPlayer(player1, 1);
        Cell celltelport=game.getBoard().getCell(12);

        // Check if the player is on the Teleportation cell
        assertEquals(celltelport,player1.getCell());
    }

    @Test
    public void testMovingPlayer_GooseCell() {
        Cell GooseCell =game.getBoard().getCell(9);
        Cell Cell = board.getCell(7);
        player1.setCell(Cell);
        Cell.putPlayer(player1);
        // Move the player to the Goose cell
        game.movingPlayer(player1, 2);
        // 9+2 goose to 11
        Cell celltogoose=game.getBoard().getCell(11);

        // Check if the player is on the cell to goose
        assertEquals(celltogoose,player1.getCell());
    }

    @Test
    public void testMovingPlayer_TrapCell() {
        Cell TrapCell =game.getBoard().getCell(31);
        Cell Cell = board.getCell(30);
        player1.setCell(Cell);
        Cell Cell2 = board.getCell(29);
        player2.setCell(Cell2);
        Cell.putPlayer(player1);
        Cell2.putPlayer(player2);
        // Move the player1 to the Trap cell
        game.movingPlayer(player1, 1);
        

        // Check if the player is on the Trap cell
        assertEquals(TrapCell,player1.getCell());

        assertFalse(TrapCell.playerCanPlay());

        // Move the player2 to the Trap cell
        game.movingPlayer(player2, 2);

        // Check if the player2 is on the Trap cell
        assertEquals(TrapCell,player2.getCell());

        // Check if the player1 is moved to the cell 29

        assertEquals(Cell2,player1.getCell());


        

    }

    @Test
    public void testIsFinished() {
        assertFalse(game.isFinished());
        Cell finalCell = board.getCell(board.getNbOfCells());
        game.addPlayer(player1);
        finalCell.putPlayer(player1);
        assertTrue(game.isFinished());
    }



    

}