import java.util.Scanner;

public class Craps 

{
	public static void main(String[] args) {

		{

		Scanner userInput = new Scanner(System.in);

		System.out.println("Hey, what's your name?");

		String name = userInput.nextLine();

		boolean isStillRolling = false;

		int point = 0;

		int counter = 0;

		System.out.println(name + " let the games begin!");

		int dieRoll1 = (int) (Math.random() * 6) + 1;

		int dieRoll2 = (int) (Math.random() * 6) + 1;

		int totalDice = dieRoll1 + dieRoll2;

		System.out.println("OK! " + name + " you rolled a total of" + totalDice);

		if(totalDice == 2|| totalDice==12)

			{

			System.out.println("Oh I'm sorry, you lost!");

			}

			else if(totalDice == 7 || totalDice ==11)

				{

				System.out.println("Good job!");

				}

					{

					System.out.println("Your point is " + totalDice);

					isStillRolling = true;

					}

				String totalDice2;

				while (isStillRolling)

					{

					int dieRoll3 = (int) ((Math.random() * 6) + 1);

					int dieRoll4 = (int) ((Math.random() * 6) + 1);

					int totalDie2 = dieRoll3 + dieRoll4;

						{

						System.out.println("Ok, " +name+ " you rolled a total of" + totalDice2);

						}

							}

							if(totalDice2 == 7)

							{

								System.out.println("I'm sorry you lost!");

								

								isStillRolling = false;

							}

							if(totalDice2 == totalDice)

								{

								System.out.println("You did very well!");

								isStillRolling=false;

								}

							

					}

		}




	}