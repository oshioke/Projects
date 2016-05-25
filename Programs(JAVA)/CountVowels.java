/*
Write a JAVA program that prompts the user to input a value n.
The program will then prompt the user to enter n number of names.
As output the program will display the name with the most vowels (a, e, i, o, u).
If there is more than one name with the same number of vowels, the program will 
display a single name.
*/
import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      int n = 0;
      int i, j; //counters
      String [] names;
      int vowelCount = 0; //store vowels in a single name
      int mostVowels = 0;  //most vowels in the name list
      int maxVowelsIndex = 0;
      
      System.out.println("Please enter an integer: ");
     n = kbd.nextInt();
      names = new String[n];
      
      kbd.nextLine(); //clear buffer
            
      //input names           
      System.out.println("Please enter " + n + " names: ");
      for(i = 0; i < n; i++)
         names[i] = kbd.nextLine();
         
//    for(i = 0; i < names.length; i++)
//       System.out.println(names[i]);
      
      for(i = 0; i < names.length; i++) //move name by name
      {
         for(j = 0, vowelCount = 0; j < names[i].length(); j++)   //inspect a single name
         {
            if('a' == names[i].charAt(j) ||
               'e' == names[i].charAt(j) ||
               'i' == names[i].charAt(j) ||
               'o' == names[i].charAt(j) ||
               'u' == names[i].charAt(j))
               vowelCount++;
         }
         if(vowelCount > mostVowels)
         {
            mostVowels = vowelCount;
            maxVowelsIndex = i;
         }
      }
         
     System.out.println("The string with the most vowels is: " +
                           names[maxVowelsIndex]); 
   }
}
