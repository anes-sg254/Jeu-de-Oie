package goosegame;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ClassicalBoardTest {

    @Test
    public void testInitBoard() {
        ClassicalBoard classicalBoard = new ClassicalBoard();
        classicalBoard.initBoard();

        assertEquals(TypeCells.START, classicalBoard.getCell(0).getType());
        assertEquals(TypeCells.GOOSE, classicalBoard.getCell(9).getType());
        assertEquals(TypeCells.GOOSE, classicalBoard.getCell(18).getType());
        assertEquals(TypeCells.TRAP, classicalBoard.getCell(31).getType());
        assertEquals(TypeCells.WAITING, classicalBoard.getCell(19).getType());
        assertEquals(TypeCells.TELEPORTATION, classicalBoard.getCell(6).getType());
    }

    @Test
    public void testGetCell() {
        ClassicalBoard classicalBoard = new ClassicalBoard();
        classicalBoard.initBoard();

        Cell cell = classicalBoard.getCell(9);
        assertNotNull(cell);
        assertEquals(TypeCells.GOOSE, cell.getType());
    }

    @Test
    public void testGetAllCells() {
        ClassicalBoard classicalBoard = new ClassicalBoard();
        classicalBoard.initBoard();

        Cell lastCell = classicalBoard.getAllCells();
        assertNotNull(lastCell);
        assertEquals(63, lastCell.getIndex());
    }
}