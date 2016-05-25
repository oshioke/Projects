//Oshioke Omoh
//CS-200
//Assignment1b3


import java.util.*;

public class PiggybankCounter
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double valueEntered;
		
		System.out.println("Please enter the total dollar amount in the piggy bank: ");
		
		valueEntered = keyboard.nextDouble();
		double fixedValue = (valueEntered * 100);
		int valueToUse = (int) fixedValue;
		
		
		int halfDollar;
		int quarter;
		int dime;
		int nickel;
		int cent;
		
		halfDollar = valueToUse / 50;
		quarter = (valueToUse % 50) / 25;
		dime = ((valueToUse % 50) % 25) / 10;
		nickel = (((valueToUse % 50) % 25) % 10) / 5;
		cent = ((((valueToUse % 50) % 25) % 10) % 10) / 1;
		
		
		System.out.println("in $"+ valueEntered +" there are:");
		System.out.println("\t"+ halfDollar + " half dollar(s), "+ quarter +" quarter(s), "+ dime +" dime(s), "+ nickel +" nickel(s), and "+ cent + " cent(s)."); 
	
	

		
		
		
		
	}
	
}