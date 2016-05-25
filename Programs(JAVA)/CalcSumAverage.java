 /*
 Write a JAVA program that prompts the user to enter
 10 integers.
 After the integers have been entered, the program 
 will display the number of integers that are greater
 than the value of the average (as an integer) of all integers entered.
 */
 import java.util.Scanner;
 
 public class CalcSumAverage
 {
    public static void main(String [] args)
    {
       Scanner kbd = new Scanner(System.in);
       int [] a = new int[10];
       int i;
       int sum = 0;
       int average = 0;
       int count = 0;
       
       System.out.println("Please enter 10 integers: ");
       
       //load array
       for(i = 0; i < a.length; i++)
       {
          System.out.println("Enter value " + (i + 1) + ":");
          a[i] = kbd.nextInt();
       }
       
       //calculate average
       for(i = 0; i < a.length; i++)
       {
          sum = sum + a[i]; //add all values in the array
       }
       average = sum/a.length;
       
       //count number of elements greater than value of average
       for(i = 0; i < a.length; i++)
       {
          if(a[i] > average)
             count++;
       }
       
       //display results
       System.out.println("The number of elements that " +
                "are greater than " + average + " is " +
                count);
    }
}
