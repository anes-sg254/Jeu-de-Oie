package goosegame;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StartCellTest {

    @Test
    public void testGetType() {
        StartCell startCell = new StartCell(5);
        assertEquals(TypeCells.START, startCell.getType());
    }


}