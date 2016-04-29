import java.util.Scanner;
import java.util.ArrayList;
	public class War
	{
		{
		Cards();
		}
	public static void main(String[] args)
		{
		if(Deck.deck.get(0).getValue() > Deck.deck.get(1).getValue())
			{
			System.out.println("Player 1 wins");
			}
			if(Deck.deck.get(1).getValue() > Deck.deck.get(0).getValue())
			{
			System.out.println("Player 2 wins");
			}
			else
			{
			System.out.println("It's a tie");
			}
		

	public static void Cards()
		{
		Object Card1;
		Card1 = 0;
	for( int Card2 = 1; Card2 < Deck.deck.length; Card2 += 2)
{
if(Deck.deck.get(Card1).getValue() > Deck.deck.get(Card2).getValue()) {

	System.out.println("Player1 wins!");

}

	else if(Deck.deck.get(Card1).getValue() == Deck.deck.get(Card2).getValue()){

	System.out.println("It's a tie");

}

	else {

	System.out.println("Player2 wins!");

}


}

int[] deck = new int[52];

for(int i = 0; i < Deck.deck.length(); i++)

{

deck[i] = i;

}

// Shuffle the cards

for (int playerOne = 0; playerOne < deck.length; playerOne++)

{

int index = (int)(Math.random() * deck.length);

int temp = deck[playerOne];

deck[playerOne] = deck[index];

deck[index] = temp;
}
for (int Player1 = 0; Player1 < 1; Player1++)

{

String suit = suits[deck[playerOne] / 13];

String rank = ranks[deck[playerOne] % 13];

System.out.println("Player 1 drew a " + rank + " of " + suit);

}

for (int Player2 = 0; Player2 < deck.length; Player2 ++)

{

int index = (int)(Math.random() * deck.length);

int temp = deck[Player2];

deck[Player2] = deck[index];

deck[index] = temp;
for (int playerTwo = 0; playerTwo < 1; playerTwo++)
{
				}
			}
		}	
	}
	private void Cards()
		{
			// TODO Auto-generated method stub
			
		}
}