package goosegame;
import goosegame.cells.*;
/**
 * The abstract class Board serves as the base class for implementing various types of game boards.
 * It defines the basic structure and behavior of a game board, such as the number of cells
 * and methods for accessing and initializing cells.
 */
public abstract class Board {
    protected int nbOfCells;
    protected Cell[] theCells;


    public Board(int nbOfCells) {
      this.nbOfCells=nbOfCells;
      this.theCells=new Cell[this.nbOfCells+1];
      this.initBoard();
    }
    /**
     * Gets the cell at the specified index on the board.
     * @param i The index of the cell to retrieve.
     * @return The Cell object at the specified index.
     */
    public Cell getCell(int i) {
        Cell c=new Cell(i);
        if(i>=0 && i<= this.nbOfCells){
            c=this.theCells[i]; 
        } 
        return c;
        

    }
    /**
     * Gets the total number of cells on the board.
     * @return The total number of cells on the board.
     */
    public int getNbOfCells() {
        return this.nbOfCells;

    }
    /**
     * Abstract method to be implemented by subclasses for initializing the board.
     * This method should set up the initial state of the game board.
     */
    public abstract void initBoard();
}


