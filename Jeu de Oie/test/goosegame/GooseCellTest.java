package goosegame;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GooseCellTest {

    @Test
    public void testBounce() {
        GooseCell gooseCell = new GooseCell(10);
        int newIndex = gooseCell.bounce(3);
        assertEquals(13, newIndex);
    }

    @Test
    public void testGetType() {
        GooseCell gooseCell = new GooseCell(22);
        assertEquals(TypeCells.GOOSE, gooseCell.getType());
    }


}