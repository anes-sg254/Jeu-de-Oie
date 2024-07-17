package goosegame;
import java.util.Random;
import goosegame.cells.*;

/**
 * The Player class represents a player in the classical Goose game. It contains
 * information about the player's name, current cell position, and methods for
 * rolling dice to move on the game board.
 */

public class Player{
    private static Random random=new Random();
    protected Cell cell;
    protected String name;

    public Player(String name){
        this.name=name;
        this.cell=null;
    } 
    /**
     * Returns a string representation of the player, which is the player's name.
     * @return The name of the player.
     */
    public String toString(){
        return this.name;
    } 
    /**
     * Gets the current cell that the player occupies on the game board.
     * @return The Cell object representing the player's current position.
     */
    public Cell getCell(){
        return this.cell;
    } 
    /**
     * Sets the player's current cell on the game board.
     * @param newCell The Cell object to set as the player's new position.
     */
    public void setCell(Cell newCell){
        this.cell=newCell;
    } 
    /**
     * Private method to simulate rolling a six-sided die and return the result.
     * @return The result of a single die throw (a value between 1 and 6).
     */
    private int oneDieThrow(){
        return Player.random.nextInt(6)+1;
    } 
    /**
     * Simulates rolling two dice and returns the sum of the results.
     * @return The sum of two dice throws (a value between 2 and 12).
     */
    public int twoDiceThrow(){
        int result=oneDieThrow()+oneDieThrow();
        return result;
    }  

} 