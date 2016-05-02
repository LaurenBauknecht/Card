import java.util.ArrayList;
import java.util.Collections;
public class Deck
	{
		static ArrayList <Card> deck = new ArrayList <Card> ();
	
		public static void fillDeck()
			{
				
			
			Deck.deck.add(new Card("Ace", "hearts", 13));

			deck.add(new Card("Ace", "spades", 13));

			deck.add(new Card("Ace", "clubs", 13));

			deck.add(new Card("Ace", "diamonds", 13));

			deck.add(new Card("Two", "spades", 2));

			deck.add(new Card("Two", "hearts",2));

			deck.add(new Card("Two", "clubs",2));

			deck.add(new Card("Two", "diamonds",2));

			deck.add(new Card("Three", "hearts",3));

			deck.add(new Card("Three", "spades",3));

			deck.add(new Card("Three", "diamonds",3));

			deck.add(new Card("Three", "clubs",3));

			deck.add(new Card("Four", "hearts",4));

			deck.add(new Card("Four", "spades",4));

			deck.add(new Card("Four", "diamonds",4));

			deck.add(new Card("Four", "clubs",4));

			deck.add(new Card("Five", "hearts",5));

			deck.add(new Card("Five", "spades",5));

			deck.add(new Card("Five", "diamonds",5));

			deck.add(new Card("Five", "clubs",5));

			deck.add(new Card("Six", "hearts",6));

			deck.add(new Card("Six", "spades",6));

			deck.add(new Card("Six", "diamonds",6));

			deck.add(new Card("Six", "clubs",6));

			deck.add(new Card("Seven", "hearts",7));

			deck.add(new Card("Seven", "spades",7));

			deck.add(new Card("Seven", "diamonds",7));

			deck.add(new Card("Seven", "clubs",7));

			deck.add(new Card("Eight", "hearts",8));

			deck.add(new Card("Eight", "spades",8));

			deck.add(new Card("Eight", "diamonds",8));

			deck.add(new Card("Eight", "clubs",8));

			deck.add(new Card("Nine", "hearts",9));

			deck.add(new Card("Nine", "spades",9));

			deck.add(new Card("Nine", "diamonds",9));

			deck.add(new Card("Nine", "clubs",9));

			deck.add(new Card("Ten", "hearts",10));

			deck.add(new Card("Ten", "spades",10));

			deck.add(new Card("Ten", "diamonds",10));

			deck.add(new Card("Ten", "clubs",10));

			deck.add(new Card("Jack", "hearts",11));

			deck.add(new Card("Jack", "spades",11));

			deck.add(new Card("Jack", "diamonds",11));

			deck.add(new Card("Jack", "clubs",11));

			deck.add(new Card("Queen", "hearts",12));

			deck.add(new Card("Queen", "spades",12));

			deck.add(new Card("Queen", "diamonds",12));

			deck.add(new Card("Queen", "clubs",12));

			deck.add(new Card("King", "hearts",13));

			deck.add(new Card("King", "spades",13));

			deck.add(new Card("King", "diamonds",13));

			deck.add(new Card("King", "clubs",13));
			Collections.shuffle(deck);
		}
}