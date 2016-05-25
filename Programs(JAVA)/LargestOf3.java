//Oshioke Omoh
//CS-200 summer
//Assignment2c
/*
Programming I, CS 200, Assignment 2, Summer 2013/Sotak
Write a program that prompts the user to enter three integer values. The program will display the largest of the three values entered. Note: if the user enters two or more equal values that represent the largest value entered, the program will still display just a single value. 
Sample Run 1: 

Please enter three integers:
	7
	33
	29
The largest value entered is: 33


Sample Run 2: 

Please enter three integers:
	73
	3
	73
The largest value entered is: 73


Sample Run 3: 

Please enter three integers:
	-7
	-33
	-2
The largest value entered is: -2*/

import java.util.Scanner;

public class LargestOf3
{
	public static void main(String[] args)
	{
		int a,b,c,larger;
		
		Scanner keyboardInput= new Scanner(System.in);
		
		System.out.println("Please enter three integers: ");
		
		a=keyboardInput.nextInt();
		b=keyboardInput.nextInt();
		c=keyboardInput.nextInt();
		
		larger=0;
		if(a >= b && a >= c)
		{
			larger = a;
		}
		else if(b >= a && b >= c)
		{
			larger = b;
		}
		else if(c >= a && c>= b)
		{
			larger = c;
		}
		
						
		System.out.println("The largest value entered is: " + larger);
	
	}
}


