import java.util.Scanner;
public class TicTacToeGame
{
	public static void main (String[] args){
		Scanner kbd= new Scanner(System.in);
		int c,playAgain;
		System.out.println("Welcome to TicTacToe");
		System.out.println();
		do
		{
			playAgain=2;
			System.out.println("What kind of Game Mode would you like to play .... ?");
			System.out.println();
			System.out.println("Press 1 for ....... Player vs Player");
			System.out.println("Press 2 for ....... Player vs Computer");
			System.out.println();
			System.out.print("Enter your choice # :");
			c = kbd.nextInt();
			System.out.println();
			//This object takes in an integer and decides whether the game is "P vs P" or "P vs C"
			NewGame game = new NewGame(c);
			//This method starts the game	
			game.Start();
			game.DisplayWinner();
			System.out.println();
			System.out.println("Do you wish to play Agin...?");
			System.out.println("Enter 1 to play Again ....");
			System.out.println("Enter 2 to Quit Game......");
			System.out.println();
			System.out.print("Enter option (1 or 2).....: ");
			playAgain = kbd.nextInt();
		}while(playAgain == 1);
		System.out.println();
		System.out.print("Thanks for Playing..... "); 
	}
	
}