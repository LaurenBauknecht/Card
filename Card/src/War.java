import java.util.Scanner;
import java.util.ArrayList;
	public class War
	{
	public static void main(String[] args)
		{
				Deck.fillDeck();
		
				for(Card c : Deck.deck)
					{
						System.out.println(c.getValue());
					}

		if(Deck.deck.get(0).getValue() > Deck.deck.get(1).getValue())
			{
			System.out.println("Player 1 wins");
			}
		else if(Deck.deck.get(1).getValue() > Deck.deck.get(0).getValue())
			{
			System.out.println("Player 2 wins");
			}
			else
			{
			System.out.println("It's a tie");
			}
		
		
//		}
//	public static void Cards()
//		{
//		Object Card1;
//		Card1 = 0;
//		for( int Card2 = 1; Card2 < Deck.deck.length; Card2 += 2)
//			{
//			if(Deck.deck.get(0).getValue() > Deck.deck.get(1).getValue()) {
//
//				System.out.println("Player1 wins!");
//
//			}		
//
//			else if(Deck.deck.get(0).getValue() == Deck.deck.get(1).getValue()){
//
//				System.out.println("It's a tie");
//
//			}
//
//			else 
//			{
//				System.out.println("Player2 wins!");
//			}
//			}
//			int[] deck = new int[52];
//			for(int i = 0; i < Deck.deck.length(); i++)
//				{
//					deck[i] = i;
//				}
//
//			// Shuffle the cards
//
//			for (int Player1 = 0; Player1 < deck.length; Player1++)
//				{
//				int index = (int)(Math.random() * deck.length);
//
//				int temp = deck[Player1];
//
//				deck[Player1] = deck[index];
//
//				deck[index] = temp;
//				}
//				for (int Player1 = 0; Player1 < 1; Player1++)
//		
//				String suit = suits(deck(Player1) / 13);
//				String rank = ranks(deck(Player1) % 13);
//					{
//						System.out.println("Player 1 drew a " + rank + " of " + suit);
//					}
//				for (int Player2 = 0; Player2 < deck.length; Player2 ++)				
//					{
//
//						int index = (int)(Math.random() * deck.length);
//
//						int temp = deck[Player2];
//
//						deck[Player2] = deck[index];
//
//						deck[index] = temp;
//						for (int player2 = 0; player2 < 1; player2++)
//
//				
			}
		}
	