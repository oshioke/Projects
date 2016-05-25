//Oshioke Omoh
//CS200 
//Assignment 2b
/*
Write a Java program that will calculate an employee's weekly pay amount. The program is to do the following:
1.	Prompt the user to enter the number of hours the employee worked for the week;
2.	Prompt the user to enter the per-hour pay the employee is to receive;
3.	Generate the amount to be paid to the employee;
a.	Note: for the purposes of this program, a regular work week is considered to be 40 or fewer hours. Should the employee work more than 40 hours, the pay for time above 40 hours is to be calculated as overtime, meaning 1 and ½ times the regular per-hour pay rate (for each overtime hour);
4.	Display the following information:
a.	The number of hours worked;
b.	The per-hour pay rate for the employee;
c.	The amount to be paid to the employee.
5.	NOTE: when displaying dollar amounts, the program is to be formatted so that only two decimal values appear to the right of the decimal point.

When turning in your program, your program should include in addition to the sample data given below three examples of test data of your own choosing, one of which would reflect overtime payment, another reflecting regular payment.  Your sample data should also include the following examples:

	Sample 1:  hours worked: 40, per-hour pay rate: $10.00
			Pay amount: $ 400.00
	Sample 2: hours worked: 50, per-hour pay rate: $10.00
			Pay amount: $ 550.00

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class PaycheckCalc
{
	public static void main(String[] args)
	{
		int hoursWorked,overtimeHours;
		double payRate,regularPayamount,overtimePayamount;
		double finalPayamount=0;
		
		Scanner keyboardInput=new Scanner(System.in);
		
		DecimalFormat dollar=new DecimalFormat("00.00");
		
		
		System.out.println("Please enter the number of hours worked for the week: ");
		hoursWorked=keyboardInput.nextInt();
		
		System.out.println("Please enter the pre-hour pay rate to be recieved: ");
		payRate=keyboardInput.nextDouble();
	
		
			regularPayamount=0;
			
		if(hoursWorked <=40)
			{
			finalPayamount=(hoursWorked*payRate);
			//System.out.println("hours worked: "+hoursWorked+","+" per-hour pay rate: $"+ dollar.format (payRate));
			
			//System.out.println("Pay amount: $ "+ dollar.format (finalPayamount));
			}					
		
		else if(hoursWorked >40)
				{
				regularPayamount=(40*payRate);
				overtimeHours=(hoursWorked-40);
				overtimePayamount=((overtimeHours*payRate)*1.5);
				finalPayamount=(overtimePayamount+regularPayamount);
		//		System.out.println("hours worked: "+hoursWorked+","+" per-hour pay rate: $"+ dollar.format (payRate) +" " +
				//				"Pay amount: $ "+ dollar.format (finalPayamount);
				
				
				}	
		System.out.println("hours worked: "+hoursWorked+","+" per-hour pay rate: $"+ dollar.format (payRate));
		//System.out.println();
		System.out.println("Pay amount: $ "+ dollar.format (finalPayamount));
			
	
	}
}


