
//Oshioke Omoh
//CS200 
//Assignment3b



import java.util.Scanner;
import java.util.ArrayList;

public class SumEvenCalc
{
	public static void main(String[] args)
	{
	
	ArrayList<Integer> intList = new ArrayList<Integer>();// array  int list will store the integers till i need to sum them
	Scanner keyBoardinput= new Scanner(System.in);
	
	
	
	boolean condition= true;
	int userInput;
	
		while (condition)// using infinite while loop that will read integers till the userInput is -999
		{
			System.out.println("Please enter a positive integer: ");
			userInput=keyBoardinput.nextInt();
	
			if (userInput == -999)
			condition = false;
			
			else if(userInput <0)
			System.out.println("Not a positive integer"); 
			
			else
			intList.add(userInput);
		}
			
		
	// output the number of integers entered
	
		System.out.println("The amount of integers that were entered is: "+intList.size());
	
	
	
	
	// The program will also display the sum of all even, double-digit positive integers entered.
		
	

	//Sum of Even numbers
	int sum= 0;//set sum to 0 so we can add to it later
	for(int numbersWithin:intList)// this is a conditional test for all integer values within the array list 
		{
			if(numbersWithin%2==0)// if any numbers within can be divided evenly with no remainders
			sum = sum+numbersWithin;//then the sum is 0 plus those even numbers 
		}
		System.out.println("The sum of all even numbers is: "+ sum);

		//sum of all even, double-digit positive integers entered.
		sum=0;
		for(int numbersWithin:intList)
		{
			if(numbersWithin%2==0 && numbersWithin >= 10)// pull out all integers that are even and are 2 digits
			sum = sum+numbersWithin;//now add all those numbers plus 0 to get the sum 
		}
	
	
		System.out.println("The sum of all even, double-digit positive integers entered is: "+ sum);
	
	}
}
