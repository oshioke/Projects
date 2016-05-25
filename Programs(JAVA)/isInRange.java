/*Write a JAVA program named isInRange that prompts the user to enter two integers, the first to identify the lowest value of a range of integers, the second to identify the upper value of a given range of integers.

The program will then prompt the user to enter an integer that is to be tested to see if it falls within the range of the low value and high value, inclusive.

For the purposes of this program you may assume that the user will input the low value first, and the high value second, therefore no data validation is required.

As output, the program will display a message “value is in range” if the search value is between or equal to one of the range values. Otherwise, the program will display a message “value is not in range”.
*/

import java.util.Scanner;

public class isInRange
{
	public static void main(String[] args)
	{
		int lowest;
		int highest;
		int x;
		Scanner keyBoardinput= new Scanner(System.in);
		
		System.out.println("please enter the low value: ");
		lowest=keyBoardinput.nextInt();
		
		System.out.println("please the high value: ");
		highest=keyBoardinput.nextInt();
		
		System.out.println("please enter the value to be tested: ");
		x=keyBoardinput.nextInt();
		
		if (x>= lowest && x<= highest)
			System.out.println("value is in range");
		
		
		else 
			System.out.println("value is not in range");
		
	}
}