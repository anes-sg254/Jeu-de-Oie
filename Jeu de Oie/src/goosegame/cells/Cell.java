package goosegame;
/**
 * The class Cell represents a cell on a game board. Each cell has an index,
 * an optional player occupying the cell, and various methods to interact with the cell.
 */
public class Cell {
    protected int index;
    protected Player player;

    public Cell(int index) {
        this.index=index;
        this.player=null;
    }
    /**
     * Gets the index of the cell.
     * @return The index of the cell on the game board.
     */
    public int getIndex() {
        return this.index;
    }
    /**
     * Gets the player currently occupying the cell.
     * @return The Player object representing the player on the cell. It can be null if the cell is empty.
     */
    public Player getPlayer(){
        return this.player;
    }
    /**
     * Checks if a player can play on this cell. Always returns true by default.
     * @return true if a player can play on this cell, false otherwise.
     */
    public boolean playerCanPlay(){
        return true;
    } 
    /**
     * Gets the type of the cell. Returns TypeCells.NORMAL by default.
     * @return The type of the cell.
     */
    public TypeCells getType(){
        return TypeCells.NORMAL;
    } 
    /**
     * Bounces the player to a new index. Returns the current index by default.
     * @param index The index to bounce to.
     * @return The index after the bounce operation.
     */
    public int bounce(int index){
        return this.index;
    } 
    /**
     * Checks if the cell is empty (i.e., no player is occupying the cell).
     * @return true if the cell is empty, false otherwise.
     */
    public boolean isEmpty(){
        return this.player==null;
    } 
    /**
     * Puts a player on the cell.
     * @param p The Player object to be placed on the cell.
     */
    public void putPlayer(Player p){
        this.player=p;
    } 
    /**
     * Returns a string representation of the cell.
     * @return A string representation of the cell, including its index.
     */
    public String toString() {
        return "Cell "+ this.getIndex();
    }

    /**
     * Checks if this cell is equal to another object.
     * @param o The object to compare with this cell.
     * @return true if the cells are equal, false otherwise.
     */
    public boolean equals(Object o){
        if(!(o instanceof Cell)){
          return false;
        }
        else{
          Cell other =(Cell) o;
          return this.getIndex()== other.getIndex();
        } 

    }



    
    

    






}




