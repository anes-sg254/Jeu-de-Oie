package goosegame;
/**
 * The TeleportationCell class represents a specific type of cell on a game board for the
 * classical Goose game. It extends the Cell class and provides a specialized implementation
 * for teleportation cells, which teleport the player to a specific index on the board.
 */
public class TeleportationCell extends Cell {
    protected int telIndex;
    public TeleportationCell(int index,int telIndex) {
        super(index);
        this.telIndex=telIndex;

    }
    /**
     * Gets the index to which the player will be teleported upon reaching this cell.
     * @return The teleportation index.
     */
    public int getTelportIndex(){
        return this.telIndex;
    } 
    /**
     * the bounce method to provide specialized bouncing behavior for teleportation cells.
     * @return The teleportation index.
     */
    public int bounce(int i){
        return this.telIndex;
    }

    /**
     * the getType method to return the type of the cell as TELEPORTATION.
     * @return The type of the teleportation cell.
     */ 
    public TypeCells getType(){
        return TypeCells.TELEPORTATION;
    }  
    /**
     * the toString method to provide a string representation of the teleportation cell,
     * including its type and index.
     * @return A string representation of the teleportation cell.
     */
    public String toString(){
        return this.getType()+"Cell"+" "+getIndex();
    }


    /**
     * Checks if this cell is equal to another object.
     * @param o The object to compare with this cell.
     * @return true if the cells are equal, false otherwise.
     */
    public boolean equals(Object o){
        if(!(o instanceof TeleportationCell)){
          return false;
        }
        else{
          TeleportationCell other =(TeleportationCell) o;
          return this.getIndex()== other.getIndex()&&this.getTelportIndex()==other.getTelportIndex();
        } 

    }

     

}