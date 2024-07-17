package goosegame;
/**
 * The TrapCell class represents a specific type of cell on a game board for the
 * classical Goose game. It extends the Cell class and provides a specialized implementation
 * for trap cells, where players cannot play and are restricted in their movement.
 */
public class TrapCell extends Cell {
    public TrapCell(int index) {
        super(index);
    }
    /**
     * Overrides the playerCanPlay method to indicate that players cannot play on trap cells.
     * @return false, indicating that players cannot play on trap cells.
     */
    public boolean playerCanPlay(){
        return false;
    }
    /**
     * Overrides the getType method to return the type of the cell as TRAP.
     * @return The type of the trap cell.
     */
    public TypeCells getType(){
        return TypeCells.TRAP;
    } 
    /**
     * Overrides the toString method to provide a string representation of the trap cell,
     * including its type and index.
     * @return A string representation of the trap cell.
     */
    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    } 

 

}