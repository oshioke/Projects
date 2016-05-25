//Oshioke Omoh
//CS-200 Assignment 5
//sam the graffiti artist

public class StoryOfSam
{
	public static void main(String [] args)
	{
		
		int red = 0;
		int blue = 0;
		int green = 0;
		int yellow = 0;
		
		int purple = 5, black = 7, white = 6;
		
		int [] freightTrain = new int [black];
		
		int count = 0,cart = 0;
		
		
		for(cart = 0; cart < freightTrain.length; cart++)
		freightTrain[cart] = 0;		
		
		
		
		while(green <= purple)
		{
			System.out.println(" Story.. Story! ");
			green = green + 2;
		}

		System.out.println();
		
		System.out.print(" Once upon a time 5 years ago, ");
		
		red++;
	
		System.out.print(" Sam was a graffitti artist with " + (red * (black - white)));
		{
			if((purple - white) >= 2)
				System.out.println(" objectives. ");
	
			count += 2;
		
			if((blue + freightTrain[2]) == 7)
				System.out.println(" goal. ");
							
			else
			{	
			System.out.println(" or more cans of paint. ");
			count-= 3;
			}
			count++;//count=3

		}
		System.out.print(" He knew he could not waste time so he ran to the train tracks and ");
		
				
		
		do
		{
			for(count = count + 0; count <6; count++)
			{
         	if(count > 3)
          	{
            	System.out.println(" spray painted the train. "); 
					count++;
           	}
         	if(count >= 4)
				{
					System.out.print(" He liked what he saw, so again he ");
					System.out.print(" picked a color then ");
				}
				else
					System.out.print(" picked a color then ");
          }
			
			count++;
										
		}
		while(count <= 7);

		System.out.println(" After a while, he got bored and went home. The end!");		
	

	}
}
			 
			
