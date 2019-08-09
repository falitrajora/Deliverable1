/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modified by: Falit Rajora, Harshdeep Kaur, Gurpreet Singh, Harkirat Cheema (11June 2019)
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public abstract class Player 
{   
    ArrayList<String> name=new ArrayList<String>();
     String[] name1=new String[7];
    public Player(String n1,String n2,String n3,String n4){
        name.add(n1);
        name.add(n2);
        name.add(n3);
        name.add(n4);
    }
    
    
    public abstract void play();
    
}
