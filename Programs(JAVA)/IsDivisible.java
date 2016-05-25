public class IsDivisible
{

	public static void main(String [] args)
	{
	int x = 0;
	int y = 0;
	
	Scanner kbd = new Scanner(System.in);
	
	System.out.println("Please enter two integers: ");
	x = kbd.nextInt();
	y = kbd.nextInt();
	
	if (x % y == 0)
		System.out.println(x + " is divisible by " + y);
	else
		System.out.println(x + " is not divisible by " + y);
	}
}