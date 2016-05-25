import java.util.Scanner;
public class Board
{
	//Variables
	private String [][] Cell= new String [3][3];
	private int x;
	private int y;
	private int count=0;
	Scanner kbd = new Scanner(System.in);
	//Contructors
	public Board()
	{
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				Cell[i][j]="E";
			
	}
	// Methods
	// 1.diplay board
	
	public void displayBoard()
	{
		for (int i=0 ; i<3 ; i++)
		{	
			for (int j=0 ; j<3 ; j++)
				if (Cell[i][j].equals("E") && j!=2)
					System.out.print("   |");
				else if (Cell[i][j].equals("E"))
					System.out.print("   ");
				else if (j<2)
					System.out.print(" " + Cell[i][j] + " |");
				else
					System.out.print(" " + Cell[i][j] + " ");
			System.out.println();
			if (i<2)
				System.out.println("---|---|---");
		}
		System.out.println();
				
	}
	
	//	2.playerMove(mark)
	public void playerMove(String mark)
	{
		System.out.println("Where would you like to place " + mark + " .....?");
		System.out.println("First enter row number and then enter the column number........");
		System.out.println();
				
		do
		{
			System.out.print("Enter Row Number 1, 2 or 3 ............: ");
			x = kbd.nextInt();
			while (x<1 || x>3)
			{
				System.out.println("Invalid Row Number ....... !");
				System.out.print("Enter Row Number 1, 2 or 3 ............?");
				x = kbd.nextInt();
			}
			System.out.println();
			System.out.print("Enter Column Number 1, 2 or 3 ............: ");
			y = kbd.nextInt();
			System.out.println();
				
			while (y<1 || y>3)
			{
				System.out.println("Invalid Column Number ....... !");
				System.out.print("Enter Column Number 1, 2 or 3 ............: ");
				y = kbd.nextInt();
			}
			if (!Cell[x-1][y-1].equals("E"))
			{
				System.out.print("The spot is already marked, try a different spot");
			}
		}while(!Cell[x-1][y-1].equals("E"));
		Cell[x-1][y-1]=mark;
		count++;
		displayBoard();
	}
	// 3.computerMove(mark)
	public void computerMove(String mark)
 	{
  		int i,j;
  
  		// Checking Vertical Possibilities
  		for(i=0; i<3; i++)
  		{
   		if(Cell[0][i].equals(mark) && Cell[1][i].equals(mark) && Cell[2][i].equals("E"))
			{
	  			Cell[2][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[2][i].equals(mark) && Cell[1][i].equals(mark) && Cell[0][i].equals("E"))
			{
	  			Cell[0][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
  	 		if(Cell[0][i].equals(mark) && Cell[2][i].equals(mark) && Cell[1][i].equals("E"))
			{
	  			Cell[1][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
		
		// Checking horizontal possibilities
  		for(i=0; i<3; i++)
  		{
   		if(Cell[i][0].equals(mark) && Cell[i][1].equals(mark) && Cell[i][2].equals("E"))
			{
	  			Cell[i][2] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[i][2].equals(mark) && Cell[i][1].equals(mark) && Cell[i][0].equals("E"))
			{
	  			Cell[i][0] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if ( Cell[i][0].equals(mark) && Cell[i][2].equals(mark) && Cell[i][1].equals("E"))
			{
	 	 		Cell[i][1] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
		
		// Checking Diagonal 1 possibilities
		// from top left to bottom right
  		
		if(Cell[0][0].equals(mark) && Cell[1][1].equals(mark) && Cell[2][2].equals("E"))
  		{
   		Cell[2][2] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[2][2].equals(mark) && Cell[1][1].equals(mark) && Cell[0][0].equals("E"))
  		{
   		Cell[0][0] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[0][0].equals(mark) && Cell[2][2].equals(mark) && Cell[1][1].equals("E"))
  		{
			Cell[1][1] = mark;
			displayBoard(); count ++; return;
  		}
		
		// CHECKING DIAGONAL 2 POSSIBILITIES
		// FROM TOP RIGHT TO BOTTOM LEFT
		
  		if(Cell[0][2].equals(mark) && Cell[1][1].equals(mark) && Cell[2][0].equals("E"))
  		{
   		Cell[2][0] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[2][0].equals(mark) && Cell[1][1].equals(mark) && Cell[0][2].equals("E"))
  		{
 	  		Cell[0][2] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[0][2].equals(mark) && Cell[2][0].equals(mark) && Cell[1][1].equals("E"))
  		{
   		Cell[1][1] = mark;
			displayBoard(); count ++; return;
  		}
		
		// BLOCKING VERTICALLY
		
  		for(i=0; i<3; i++)
  		{
   		if(Cell[0][i].equals("X") && Cell[1][i].equals("X") && Cell[2][i].equals("E"))
			{
	  			Cell[2][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[2][i].equals("X") && Cell[1][i].equals("X") && Cell[0][i].equals("E"))
			{
	  			Cell[0][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[0][i].equals("X") && Cell[2][i].equals("X") && Cell[1][i].equals("E"))
			{
	 	 		Cell[1][i] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
		
		// BLOCKING HORIZONTALLY
  		
		for(i=0; i<3; i++)
  		{
   		if(Cell[i][0].equals("X") && Cell[i][1].equals("X") && Cell[i][2].equals("E"))
			{
	  			Cell[i][2] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[i][2].equals("X") && Cell[i][1].equals("X") && Cell[i][0].equals("E"))
			{
	 	 		Cell[i][0] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		for(i=0; i<3; i++)
  		{
   		if(Cell[i][0].equals("X") && Cell[i][2].equals("X") && Cell[i][1].equals("E"))
			{
	 	 		Cell[i][1] = mark;
	  			displayBoard(); count ++; return;
			}
  		}
  		
		// BLOCKING DIAGONALLY 1
		// FROM TOP LEFT TO BOTTOM RIGHT
		
		if(Cell[0][0].equals("X") && Cell[1][1].equals("X") && Cell[2][2].equals("E"))
  		{
   		Cell[2][2] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[2][2].equals("X") && Cell[1][1].equals("X") && Cell[0][0].equals("E"))
  		{
   		Cell[0][0] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[0][0].equals("X") && Cell[2][2].equals("X") && Cell[1][1].equals("E"))
  		{
   		Cell[1][1] = mark;
			displayBoard(); count ++; return;
  		}
		
		// BLOCKING DIAGONALLY 2
		// FROM TOP RIGHT TO BOTTOM LEFT
		
  		if(Cell[0][2].equals("X") && Cell[1][1].equals("X") && Cell[2][0].equals("E"))
  		{
   		Cell[2][0] = mark;
			displayBoard(); count ++; return;
  		}
  		
		if(Cell[2][0].equals("X") && Cell[1][1].equals("X") && Cell[0][2].equals("E"))
  		{
   		Cell[0][2] = mark;
			displayBoard(); count ++; return;
  		}
  		if(Cell[0][2].equals("X") && Cell[2][0].equals("X") && Cell[1][1].equals("E"))
  		{
   		Cell[1][1] = mark;
			displayBoard(); count ++; return;
  		}
		
		for(i=0; i<3; i++)
  		{
  			for(j=0; j<3; j++)
			{
	 			if(Cell[i][j].equals("E"))
	 			{
	  				Cell[i][j] = mark;
	  				displayBoard(); count ++; return;
	 			}
			}
  		}
		
		if(Cell[1][1].equals("E"))
  		{
   		Cell[1][1] = mark;
			displayBoard(); count ++; return;
  		}
	}
 
	// 4.checkWinner(mark)
	public boolean checkWinner(String mark)
	{
		boolean found = false;
		if (Cell[0][0].equals(mark) && (Cell[0][1].equals(mark) && Cell[0][2].equals(mark)) )
			found = true;
		else if (Cell[1][0].equals(mark) && (Cell[1][1].equals(mark) && Cell[1][2].equals(mark)) )
			found = true;
		else if (Cell[2][0].equals(mark) && (Cell[2][1].equals(mark) && Cell[2][2].equals(mark)) )
			found = true;
		else if (Cell[0][0].equals(mark) && (Cell[1][0].equals(mark) && Cell[2][0].equals(mark)) )
			found = true;
		else if (Cell[0][1].equals(mark) && (Cell[1][1].equals(mark) && Cell[2][1].equals(mark)) )
			found = true;
		else if (Cell[0][2].equals(mark) && (Cell[1][2].equals(mark) && Cell[2][2].equals(mark)) )
			found = true;
		else if (Cell[0][0].equals(mark) && (Cell[1][1].equals(mark) && Cell[2][2].equals(mark)) )
			found = true;
		else if (Cell[0][2].equals(mark) && (Cell[1][1].equals(mark) && Cell[2][0].equals(mark)) )
			found = true;
		return found;
	}
	// 5.Check Drawn
	public boolean checkDrawn()
	{
		return (count==9);
	}
	

}