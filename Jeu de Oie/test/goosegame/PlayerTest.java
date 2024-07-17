package goosegame;


import static org.junit.Assert.*;


import org.junit.Test;

public class PlayerTest {


    @Test
    public void testGetCell() {
        Player player = new Player("didin");
        assertNull(player.getCell());

        Cell cell = new Cell(10);
        player.setCell(cell);
        assertNotNull(player.getCell());
        assertEquals(cell, player.getCell());
    }

    @Test
    public void testSetCell() {
        Player player = new Player("falou");
        assertNull(player.getCell());

        Cell cell = new Cell(15);
        player.setCell(cell);
        assertNotNull(player.getCell());
        assertEquals(cell, player.getCell());
    }

    @Test
    public void testTwoDiceThrow() {
        Player player = new Player("Reda");
        int result = player.twoDiceThrow();
        assertTrue(result >= 2 && result <= 12);
    }
}