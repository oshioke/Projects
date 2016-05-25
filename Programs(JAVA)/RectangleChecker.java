/*
Write a JAVA program named IsRectangle that prompts the user to enter four integers representing the lengths of the four sides of a possible rectangle.

As output, the program will display a message indicating whether or not the four sides are those of a rectangle.

Note: for purposes of this program, a square (in which the lengths of all four sides are equal) will not be considered to be a rectangle.

Note: for purposes of this program, the degrees of each of the four angles need not to be taken into consideration.

Sample input/output

Sample 1: 
Input values:		s1 = 34, s2 = 34, s3 = 96, s4 = 96
Output:			The four sides represent those of a rectangle.

Sample 2: 
Input values:		s1 = 34, s2 = 34, s3 = 34, s4 = 34
Output:			The four sides do not represent those of a rectangle.

Sample 3: 
Input values:		s1 = 34, s2 = 44, s3 = 63, s4 = 71
Output:			The four sides do not represent those of a rectangle.
*/


import java.util.Scanner;

public class RectangleChecker
{
	public static void main(String[] args)
	{
		
		
		//declare and initialize
		int s1,s2,s3,s4;
		
		Scanner keyBoardinput= new Scanner(System.in);
	
		boolean isRectangle = false;

		
		
		//prompt for integers
		System.out.println("Please enter the length of the first side: ");
		s1=keyBoardinput.nextInt();
		
		System.out.println("Please enter the length of the second side: ");
		s2=keyBoardinput.nextInt();
		
		System.out.println("Please enter the length of the third side: ");
		s3=keyBoardinput.nextInt();
		
		System.out.println("Please enter the length of the fourth side: ");
		s4=keyBoardinput.nextInt();
		
		
		
		//conditional testing
		
	//Check if the sides can make a rectangle
		if(s1 == s2 && s2 == s3 && s3 == s4)//square=false
		{
			isRectangle = false;
		}
		else if(s1 == s2 && s3 == s4)
		{
			isRectangle = true;		
		}
		else if(s1 == s3 && s2 == s4)
		{
			isRectangle = true;		
		}
		else if(s1 == s4 && s2 == s3)
		{
			isRectangle = true;		
		}
		else
		{
			isRectangle = false;
		}
		
		//Display the result
		if(isRectangle)
			System.out.println("Is rectangle");
		else
			System.out.println("Is NOT rectangle");
	}
}		
		
		
		
		
	