/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modified by: Falit Rajora, Harshdeep Kaur, Gurpreet Singh, Harkirat Cheema (11June 2019)
 */
package ca.sheridancollege.project;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards extends Card
{
   
    String[] SUITS={"Clubs","Diamonds","Hearts","Spades"};
    String[] RANKS= {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
    private int handSize = 52;
    public static List<Card> cards=new ArrayList<Card>();
    
    static List<String> nam1 = GroupOfCards.cards.stream()
   .map(object -> Objects.toString(object, null))
   .collect(Collectors.toList());
    
    public GroupOfCards(Suit s, Value gVal) {
        super(s, gVal);
    }
    
    public static void generateHand(){
         int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards.add(new GroupOfCards(s,v));
                        countCards++;
                        
                    }
                }
    }
    
     public static void shuffle()
    {
        Collections.shuffle(cards);
    }
     
     public static void showCards(){
         
             generateHand();

             for(Card c: cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
     }
    @Override
     public String toString(){
         return "Card Game";
     }
        
     
}//end class
