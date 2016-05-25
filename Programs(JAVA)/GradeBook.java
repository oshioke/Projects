/* A) Write a java program for the instructor of 207 that will calculate the final grade of the class. 
The instructor will give you as input the six grades of quizzes and programming assignments. 
The instructor will also give you the final grade. Follow the rules in the syllabus to compute the final letter grade. (10 points)

B) Write a java program using classes that for the program above that will display the grade in points, 
the final letter grade, and the max and min grade obtained in their 
quizzes and programming Assignments. (10 points)*/

/*According to the grades on D2L, there are 6 Quizzes worth 100 points each, 
6 assignments worth 20 points each, and a final worth 100 points. Quizzes are 60% 
of your final grade, assignments are 10%, and your final is worth 30%.*/

import java.util.Scanner;

public class GradeBook
{
	public static void main(String [] args)
	{
		double sumOfAssignments= 0;
		double sumOfQuizzes= 0;
		double qAverage= 0;
		double aAverage= 0;
		double weightedQ=0;		
		double weightedA=0;
		double finalScore=0;
		
		Scanner kbd= new Scanner(System.in);
		
		double [] aGrades= new double [6];	//array to store assi grades
		double [] qGrades= new double [6];  // array to store quiz grades
		int i;	//array counter
				
		//loop for assignments
		for(i=0; i < aGrades.length; i++)
		{			
			System.out.print(" Please enter the score for assignment " + (i + 1)+ " : ");
			
			aGrades[i]= kbd.nextInt();
			sumOfAssignments= (sumOfAssignments+aGrades[i]);
		}
		
		System.out.println();
		System.out.println("The sum of all assignments is : "+sumOfAssignments);	
		System.out.println();
		
		aAverage= (sumOfAssignments/6);//assi average
		
		System.out.println(" The average of all assignments is : " + aAverage);
		System.out.println();
		
		//assignment score
		weightedA=(aAverage *.1);
		
		
		//loop for quizzes
		for(i=0; i < qGrades.length; i++)
		{
			System.out.print(" Please enter the score for quiz " + (i + 1)+ " : ");
			qGrades[i]= kbd.nextInt();
			
			sumOfQuizzes= (sumOfQuizzes+qGrades[i]);
		}
		System.out.println();
		System.out.println(" The sum of all quiz scores is : " +sumOfQuizzes);	
		System.out.println();
		
		//quiz average
		qAverage=(sumOfQuizzes/6);
		System.out.println(" The average of all quizzes is : " + qAverage);
		System.out.println();
		
		//quiz score
		weightedQ=(qAverage * .6);
		
		finalScore=(weightedA + weightedQ);
		
		
		System.out.println();

		if(finalScore > 90.00)
			System.out.println(" The final grade is an A ");
			
		if(finalScore >= 80.00 && finalScore <=89.00)		
			System.out.println(" The final grade is a B ");
		
		if(finalScore >= 70.00 && finalScore <= 79.00)
			System.out.println(" The final grade is a C ");
			
		if(finalScore >= 60.00 && finalScore <=69.00)
			System.out.println(" The final grade is a D ");
		
		if(finalScore <=59.00)
			System.out.println(" The final grade is a F ");
			
			
			
		System.out.print(" The final score in the class is : ");	
		System.out.printf("%.2f",finalScore);
	
	
	
	
	
	}
}