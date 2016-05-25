public class Duplicates
{
	public static void main(String[] args)
	{
		int [] list_aa = {17, 39, 53, 53, 67, 78};
		int [] list_bb = {17, 39, 53, 54, 67, 78};
		boolean duplicates = false; // assume that there are no duplicates 
		
		int i;
		
		for(i = 0; i < list_aa.length - 1 && !duplicates/* or duplicates == false*/; i++)
		{
			if(list_aa[i] == list_aa[i + 1]) //searches for duplicates 
				System.out.println("There are duplicates.");
				duplicates = true;
		}
			
		if(duplicates)
			System.out.println("There are duplicates."); 
			
		else	
			System.out.println("There are no duplicates.");
	
	}
}