//Oshioke Omoh
//CS200 Assignment4c

public class BoboTurnsLockers
{
	public static void main (String[] args)
	{
		int count = 0;
		int [] lockers = new int [1000];
		int lockerNumber;
		// 1 = closed  &&&&&  2= open
		
		//he starts at one end of the school and opens them all.
		for( lockerNumber = 0; lockerNumber < lockers.length; lockerNumber++)
		{
			lockers[lockerNumber]= 2;
		}
		
		
		//Then he goes back to the start and closes EVERY OTHER locker (lockers 2, 4, 6, and so on).
		for( lockerNumber = 1; lockerNumber < lockers.length; lockerNumber+=2)
		{
			lockers[lockerNumber]= 1;
		}

		
		
		
		
		//Then he goes back to the start and visits EVERY THIRD,fourth,fifth,sixth till 1000th locker:  
		int pattern = 1;
		
		
		do
		{
			pattern++;//start at two and keep starting by the next number after loop is done
		//(scan  every third fourth fifth (so on untill 1000th,) locker 
			
			for( lockerNumber = pattern; lockerNumber < lockers.length; lockerNumber += (pattern + 1))
			{
				
				//if it is open, he closes it;
				if(lockers[lockerNumber] == 2)
					lockers[lockerNumber] = 1;
			
				//if it is closed, he opens it.	
				else if(lockers[lockerNumber] == 1)
					lockers[lockerNumber] = 2;
			}
		}
		while(pattern <= 1000);		
		//display current state of every locker
		for( lockerNumber = 0; lockerNumber <lockers.length; lockerNumber++)
		System.out.println("Locker number "+(lockerNumber + 1 )+(" is ")+lockers[lockerNumber]);
	
		
		
		
		for( lockerNumber = 0; lockerNumber <lockers.length; lockerNumber++)
			if(lockers[lockerNumber] == 2)
			{
				System.out.println(" Locker number "+ lockerNumber + (" is left opened. "));
				count++;
			}
		
		System.out.print(" There are " + count + " lockers left open.");	
	
	}
}

