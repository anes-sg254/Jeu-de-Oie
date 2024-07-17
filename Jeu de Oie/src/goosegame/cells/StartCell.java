package goosegame;
/**
 * The StartCell class represents the starting cell on a game board for the classical Goose game.
 * It extends the Cell class and provides a specialized implementation for the starting cell.
 */
public class StartCell extends Cell{
    public StartCell(int index) {
        super(index);
    }
    /**
     * Overrides the getType method to return the type of the cell as START.
     * @return The type of the starting cell.
     */
    public TypeCells getType() {
        return TypeCells.START;
    }
    /**
     * Overrides the toString method to provide a string representation of the starting cell,
     * including its type and index.
     * @return A string representation of the starting cell.
     */
    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    }


}