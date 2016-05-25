import java.util.Scanner;

public class xleapyear// if, else, else if statements. nested conditional testing
{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		int y;
		
		System.out.println("Please enter a positive integer value between 1600 and 2012, inclusive, that represents a year.");
		y = kbd.nextInt();
		
		if(y % 4 == 0)
		{
			if( y %  4 == 0 && y % 100 == 0 && y % 400 == 0)
			System.out.print( y + " is a leap year because " + y + " is divisible by 4, 100, and 400.");
			
			
			else if(y % 100 ==0)
			System.out.print( y + " is not a leap year because "+ y + " is divisible by 4 but is also divisible by 100.");
			
						
			else
			System.out.print( y + " is a leap year because "+ y+ " is divisible by 4."); 
			
			
	
		}
		else 
		System.out.print( y + " is not a leap year because " + y + " is not divisible by 4.");
		
		
	}
}