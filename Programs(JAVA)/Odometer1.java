//Oshioke Omoh
//CS200 Assingment4a
//One Is The Magic Number

public class Odometer1
{
	public static void main(String [] args)
	{
		
		int ones,tens,hundreds,thousands,tenThousands,hundredThousands;
		int count = 0;
		
		
			
			
			for(hundredThousands = 0; hundredThousands <= 9; hundredThousands++)
			{
	          if(hundredThousands == 1)
	          {
				 	count++;
	    					 
				 } 		
				for(tenThousands = 0; tenThousands <= 9; tenThousands++)
	    		{      
	         	if(tenThousands == 1)
	            count++;
	          		
					for(thousands = 0; thousands <= 9; thousands++)
					{
	         		if(thousands == 1)
	          		count++;
	         					
						for(hundreds = 0; hundreds <= 9; hundreds++)
						{			
	          			if(hundreds == 1)
	         			count++;
							
									
							
							
							for(tens = 0; tens <= 9; tens++)
							{
	          				
								if(tens == 1)
	         				count++;
								
								
								for(ones = 0; ones <= 9; ones++)
								{
	          					if(ones == 1)
	          					count++;
	          					
								}
							}
						}
					}
				}
			}
				System.out.println(" The number 1 appears " + count + " times going from 0 to 999,999.");
	
	
	}
}


													
													
											
													
															


         

										
          


					



