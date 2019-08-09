/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modified by: Falit Rajora, Harshdeep Kaur, Gurpreet Singh, Harkirat Cheema (11June 2019)
 */
package ca.sheridancollege.project;
import java.util.*;
import static java.util.Collections.list;
import java.util.stream.Collectors;


/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game extends Player
{
    public Game(String n1,String n2,String n3,String n4){
        super(n1,n2,n3,n4);
    }
    @Override
   public void play(){
       GroupOfCards.shuffle();
       
       for(int i=0;i<7;i++){
           
           GroupOfCards.nam1.add(i,GroupOfCards.cards);
          // name1[i]=GroupOfCards.cards.get[i);
       }
   }
    
}//end class
