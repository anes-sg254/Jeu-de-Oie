package goosegame;
import java.util.*;
import goosegame.cells.*;
/**
 * The Game class represents a game of the Goose board game. It manages the players,
 * the game board, and the game logic.
 */
public class Game{
    protected List<Player> theplayers;
    protected Board board;
    protected Iterator<Player> iterator;

    public Game(Board board){
        this.board=board;
        this.theplayers=new ArrayList<Player>();
        
    } 
    /**
     * Adds a player to the game, placing them on the StartCell.
     * @param p The player to be added to the game.
     */
    public void addPlayer(Player p){
        this.theplayers.add(p);
        StartCell c = new StartCell(0);
        p.setCell(c);
        c.putPlayer(p);
    }
    /**
     * Retrieves the list of players currently in the game.
     * @return A list of Player objects representing the players in the game.
     */
    public List<Player> getPlayers(){
        return this.theplayers;
    } 
    /**
     * Retrieves the game board used in the game.
     * @return The Board object representing the game board.
     */
    public Board getBoard(){
        return this.board;
    } 
    /**
     * Calculates the next index for a player after moving, considering the board's
     * circular nature.
     * @param i The number of cells to move.
     * @return The next index after moving i cells.
     */
    public int indexMoving(int i){
        if(i>this.board.getNbOfCells()){
            int returnInt=i-this.board.getNbOfCells();
            return this.board.getNbOfCells()-returnInt;
        } 
        return i;
    } 
    /**
     * Moves the player on the board based on the dice throw, handling special cell types
     * and interactions with other players.
     * @param p The player to move.
     * @param i The number rolled on the dice.
     */
    public void movingPlayer(Player p,int i){
        Cell currentCell=p.getCell();
        int currentIndex=currentCell.getIndex();
        int nextIndex=this.indexMoving(currentIndex+i);
        Cell nextCell=this.board.getCell(nextIndex);
        int bounceIndex=this.indexMoving(nextCell.bounce(i));
        Cell bounceCell=this.board.getCell(bounceIndex);
        System.out.println("\n"+p.toString() + " is on the cell  " +currentCell.toString()+" " + " ," +p.toString()+" throws " + i +" and reaches "+ nextCell.getIndex()+" "+nextCell.getType());

        if(nextCell.getType() != TypeCells.NORMAL){
            if(nextCell.getType()==TypeCells.WAITING){
                System.out.println(p.toString()+" is on a "+" "+bounceCell.toString());
            } 
            else if(nextCell.getType()==TypeCells.TELEPORTATION){
                System.out.println(p.toString()+" is on a "+nextCell.toString()+" and so jumps to "+ bounceCell.getIndex()+" ");
            } 
            
        }        

        if(!bounceCell.isEmpty()){
            Player otherplayer=bounceCell.getPlayer();
            otherplayer.setCell(currentCell);
            currentCell.putPlayer(otherplayer);
            p.setCell(bounceCell);
            bounceCell.putPlayer(p);
            System.out.println(" cell is busy "+otherplayer.toString()+" " );
            System.out.print( " and so jumps to "+ bounceCell.getIndex()+" ");

        }
        currentCell.putPlayer(null);
        bounceCell.putPlayer(p);
        p.setCell(bounceCell);


    } 
    /**
     * Checks if the game has finished by determining if the final cell is occupied.
     * @return True if the game is finished, false otherwise.
     */
    public boolean isFinished(){
        Cell finalCell=this.board.getCell(this.board.getNbOfCells());
        if(finalCell.isEmpty()){
            return false;
        } 
        return true;
    }
    /**
     * Retrieves the next player in the sequence, cycling back to the first player if needed.
     * @return The next player to take a turn.
     */
    public Player nextPlayer(){
        
        if(this.iterator.hasNext()){
            return this.iterator.next();
        } 
        this.iterator=this.theplayers.iterator();
        return this.iterator.next();
    } 
    /**
     * Initiates and manages the game loop, allowing each player to take their turn until
     * the game is finished. Prints the winner and a congratulatory message at the end.
     */
    public void play(){
        for(Player p:this.theplayers){
            p.setCell(this.board.getCell(0));
        } 
        
        this.iterator=this.theplayers.iterator();
        while(!this.isFinished()){
            Player p=this.nextPlayer();
            Cell c=p.getCell();
            if(c.playerCanPlay()){
               int index= p.twoDiceThrow();
               this.movingPlayer(p,index);
            } 
            else{
              String answer = p.toString() + " is in "+ c.toString()+", "+p.toString() + " cannot play ";
              System.out.println(answer);
            }
        } 
        Player p = this.board.getCell(63).getPlayer();
        System.out.println(p.toString()+" has won ");
        System.out.println("CONGRATULATIONS !!");


    } 











 

    


} 