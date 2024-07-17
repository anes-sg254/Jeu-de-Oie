package goosegame;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WaitingCellTest {

    @Test
    public void testGetNbRounds() {
        WaitingCell waitingCell = new WaitingCell(12, 3);
        assertEquals(3, waitingCell.getNbRounds());
    }

    @Test
    public void testGetTime() {
        WaitingCell waitingCell = new WaitingCell(18, 5);
        assertEquals(5, waitingCell.getTime());
    }

    @Test
    public void testGetWaitingTime() {
        WaitingCell waitingCell = new WaitingCell(22, 4);
        assertEquals("waiting for 4 turns", waitingCell.getWaitingTime());
    }

    @Test
    public void testPlayerCanPlay() {
        WaitingCell waitingCell = new WaitingCell(8, 2);
        assertFalse(waitingCell.playerCanPlay());
        waitingCell.playerCanPlay();
        assertTrue(waitingCell.playerCanPlay()); 
    }

    @Test
    public void testPutPlayer() {
        WaitingCell waitingCell = new WaitingCell(15, 3);
        Player player = new Player("anes");
        waitingCell.putPlayer(player);
        assertEquals(3, waitingCell.getTime());
    }

    @Test
    public void testGetType() {
        WaitingCell waitingCell = new WaitingCell(20, 1);
        assertEquals(TypeCells.WAITING, waitingCell.getType());
    }

  
}