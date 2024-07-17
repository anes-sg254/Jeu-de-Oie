package goosegame;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TrapCellTest {

    @Test
    public void testPlayerCanPlay() {
        TrapCell trapCell = new TrapCell(15);
        assertFalse(trapCell.playerCanPlay());
    }

    @Test
    public void testGetType() {
        TrapCell trapCell = new TrapCell(25);
        assertEquals(TypeCells.TRAP, trapCell.getType());
    }


}