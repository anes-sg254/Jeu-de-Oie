package goosegame;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

    @Test
    public void testGetIndex() {
        Cell cell = new Cell(5);
        assertEquals(5, cell.getIndex());
    }

    @Test
    public void testGetPlayer() {
        Cell cell = new Cell(3);
        assertNull(cell.getPlayer());

        Player player = new Player("Alice");
        cell.putPlayer(player);
        assertEquals(player, cell.getPlayer());
    }

    @Test
    public void testPlayerCanPlay() {
        Cell cell = new Cell(8);
        assertTrue(cell.playerCanPlay());
    }

    @Test
    public void testGetType() {
        Cell cell = new Cell(12);
        assertEquals(TypeCells.NORMAL, cell.getType());
    }

    @Test
    public void testBounce() {
        Cell cell = new Cell(17);
        int newIndex = cell.bounce(22);
        assertEquals(17, newIndex);
    }

    @Test
    public void testIsEmpty() {
        Cell cell = new Cell(25);
        assertTrue(cell.isEmpty());

        Player player = new Player("Bob");
        cell.putPlayer(player);
        assertFalse(cell.isEmpty());
    }

    @Test
    public void testPutPlayer() {
        Cell cell = new Cell(30);
        Player player = new Player("Charlie");
        cell.putPlayer(player);
        assertEquals(player, cell.getPlayer());
    }

    @Test
    public void testToString() {
        Cell cell = new Cell(10);
        assertEquals("Cell 10", cell.toString());
    }

    @Test
    public void testEquals() {
        Cell cell1 = new Cell(15);
        Cell cell2 = new Cell(15);
        Cell cell3 = new Cell(20);

        assertTrue(cell1.equals(cell2));
        assertFalse(cell1.equals(cell3));
    }
}