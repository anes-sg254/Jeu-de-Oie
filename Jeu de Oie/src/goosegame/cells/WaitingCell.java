package goosegame;
/**
 * The WaitingCell class represents a specific type of cell on a game board for the
 * classical Goose game. It extends the Cell class and provides a specialized implementation
 * for waiting cells, where players must wait for a specified number of rounds before being
 * allowed to play again.
 */
public class WaitingCell extends Cell {
    protected int nbrounds;
    protected int time;
    public WaitingCell(int index,int nbrounds) {
        super(index);
        this.nbrounds=nbrounds;
        this.time=nbrounds;

    }
    /**
     * Gets the total number of rounds a player must wait in the waiting cell.
     * @return The number of rounds a player must wait.
     */
    public int getNbRounds(){
        return this.nbrounds;
    } 
    /**
     * Gets the remaining waiting time in rounds.
     * @return The remaining waiting time.
     */
    public int getTime(){
        return this.time;
    } 
    /**
     * Gets a string representation of the waiting time.
     * @return A string indicating the remaining waiting time in turns.
     */
    public String getWaitingTime(){
      return "waiting for "+getTime()+" turns";
    }
    /**
     * the playerCanPlay method to implement waiting behavior.
     *
     * @return true if the waiting time is zero, allowing the player to play; false otherwise.
     */
    public boolean playerCanPlay(){
        if(this.time==0){
            return true;
        }
        this.time=this.time-1; 
        return false;
    } 
    /**
     * Overrides the putPlayer method to reset the waiting time when a player enters the waiting cell.
     * @param p The Player object to be placed on the cell.
     */
    public void putPlayer(Player p){
        super.putPlayer(p);
        this.time=this.nbrounds;
    } 
    /**
     * the getType method to return the type of the cell as WAITING.
     * @return The type of the waiting cell.
     */
    public TypeCells getType(){
        return TypeCells.WAITING;
    } 
    /**
     * Overrides the toString method to provide a string representation of the waiting cell,
     * including its type, index, and waiting time.
     * @return A string representation of the waiting cell.
     */
    public String toString(){
        return this.getType()+"Cell"+" "+getIndex()+" "+this.getWaitingTime();
    } 

}