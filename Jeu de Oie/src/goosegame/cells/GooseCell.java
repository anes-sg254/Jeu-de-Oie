package goosegame;
/**
 * The GooseCell class represents a specific type of cell on a game board for the
 * classical Goose game. It extends the Cell class and overrides certain methods
 * to provide specialized behavior for goose cells.
 */
public class GooseCell extends Cell {
    public GooseCell(int index) {
        super(index);
    }
    /**
     * Overrides the bounce method to provide specialized bouncing behavior for goose cells.
     * @param i The index to bounce to.
     * @return The index after the bounce operation.
     */

    public int bounce(int i){
        return this.index+i;
    } 
    /**
     * Overrides the getType method to return the type of the cell as GOOSE.
     * @return The type of the goose cell.
     */

    public TypeCells getType(){
        return TypeCells.GOOSE;
    } 

    /**
     * Overrides the toString method to provide a string representation of the goose cell,
     * including its type and index.
     * @return A string representation of the goose cell.
     */
    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    } 



    

}