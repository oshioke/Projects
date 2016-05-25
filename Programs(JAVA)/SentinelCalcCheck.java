import java.util.*;
public class SentinelCalcCheck
{
	public static void main(String a[])
	{
	List<Integer> intList = new ArrayList<Integer>();
	boolean condition = true;
	int count=0;
	int temp;
	int listAmount;
	Scanner sc =new Scanner(System.in);

	//Read all the integers until -999
		while(condition)
		{
			System.out.print("Please enter a Integer :");
			temp = sc.nextInt();
			
			if(temp == -999)
			condition = false;

			else
			intList.add(temp);
		}

	//Display all the integers in the list
	System.out.println("You enetered the following integers");
	for(int cur:intList)
	System.out.println(cur);

	//No of integers Entered
	
	System.out.println("Size of the Array is : "+intList.size());

	//Sum of Even numbers
	int sum= 0;
	for(int cur:intList)
		{
			if(cur%2==0)
			sum = sum+cur;
		}
		System.out.println("The sum of even numbers is "+ sum);

		//sum of all even, double-digit positive integers entered.
		sum=0;
		for(int cur:intList)
		{
			if(cur%2==0 && String.valueOf(cur).length() ==2)
			sum = sum+cur;
		}
	
	
		System.out.println("The sum of even, double-digit positive integers entered "+ sum);
	

	}
}
	