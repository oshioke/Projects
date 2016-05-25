//Oshioke Omoh
//CS200
//Assignment2a



import java.util.Scanner;

public class Descending3ints
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner keyboardInput= new Scanner(System.in);
		
		System.out.println("Please enter three integers: ");
		
		a=keyboardInput.nextInt();
		b=keyboardInput.nextInt();
		c=keyboardInput.nextInt();
	
	
	
				
		
		if(a==b && b==c)//if all three integers are the same display just a
			System.out.println(a+" "+a+" "+a);
		
		
		else if(a>=b && b>=c)
			System.out.println(a+" "+b+" "+c);
		else if(b>=a && a>=c)
			System.out.println(b+" "+a+" "+c);

					else if(a>=c && c>=b)
						System.out.println(a+" "+c+" "+b);
							else if(c>=a && a>=b)
								System.out.println(c+" "+a+" "+b);

			
					else if(b>=c && c>=a)
						System.out.println(b+" "+c+" "+a);
							else if(c>=b && b>=a)
								System.out.println(c+" "+b+" "+a);
				
			
	
	
	
	
	
	
	
	
	}
}



