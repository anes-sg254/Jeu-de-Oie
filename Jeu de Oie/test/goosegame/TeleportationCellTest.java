package goosegame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeleportationCellTest {

    @Test
    public void testGetTeleportIndex() {
        TeleportationCell teleportationCell = new TeleportationCell(8, 15);
        assertEquals(15, teleportationCell.getTelportIndex());
    }

    @Test
    public void testBounce() {
        TeleportationCell teleportationCell = new TeleportationCell(12, 20);
        int newIndex = teleportationCell.bounce(8);
        assertEquals(20, newIndex);
    }

    @Test
    public void testGetType() {
        TeleportationCell teleportationCell = new TeleportationCell(18, 25);
        assertEquals(TypeCells.TELEPORTATION, teleportationCell.getType());
    }


}