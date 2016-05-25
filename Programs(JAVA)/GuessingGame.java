//Oshioke Omoh
//Cs200
//Assignmrnt3a

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
	
   public static void main(String[] args)
	{
		//create an object of type Random:		
		Random randomNumbers= new Random();
		Scanner keyboardInput = new Scanner(System.in);
		
		// variable to store the value generated by the computer 
		int computerNum;
		
		//variable to store the users guess
		int userGuess;
		
		//declare and initialize the boolean conditional test statement and number of tries
		
		//prompt the user to guess at the number selected by the computer
		System.out.println("To play our guessing game, the computer will select a number\n  "+
		"between 1 and 100. You will be prompted by the computer to guess that number.\n "+
		"For each incorrect guess, the computer will indicate whether the number it selected\n "+ 
		"is higher or lower than your guess.\n "+
		"Once you guess the value, the computer will indicate how many tries it took\n "+
      "for you to guess the number.\n");
			
String userInput;
char userResponse;			
			
do
{
		//generate a random number between 1 and 100
		computerNum = randomNumbers.nextInt(99);

		int tries = 1;
		int success = 0;

		
		while(success == 0)//t game
		{
		//collect the user input
			System.out.println("Please enter a number between 1 and 100: ");
			userGuess = keyboardInput.nextInt();

			if(userGuess < 1 || userGuess > 100)
			{
				System.out.println("The value entered is out of range");
			}
			
			if(userGuess == computerNum)
			{
				success = 1;
				System.out.println("congratulations!!!\n "+
				"You guessed the number in " + tries + " tries.");
			}
			
			else if(userGuess < computerNum)
			{
				++tries;
				System.out.println("The number you entered is too low.");
			}
			
			else if (userGuess > computerNum && userGuess < 100)
			{
				++tries;
				System.out.println("The number you entered is too high.");
			}
		}
		keyboardInput.nextLine();
		System.out.println("Do you wish to play again? ");
		userInput = keyboardInput.nextLine();
		userResponse = userInput.charAt(0);
		while(userResponse != 'Y' && userResponse != 'y' && userResponse != 'N' && userResponse != 'n')
			{
				System.out.println("Invalid value");
				System.out.println("Do you wish to play again? ");
				userInput = keyboardInput.nextLine();
				userResponse = userInput.charAt(0);

			}

}
while(userResponse == 'Y' || userResponse == 'y');


	System.out.println("Thank you for playing");				
		
	}
}						
		
		
		
		
		
	