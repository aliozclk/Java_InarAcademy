package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students :");
		int numOfStudents = input.nextInt();
		double highestScore = 0 ;
		String studentsName = "";
		
		for (int i = 0; i < numOfStudents ; i++) {
			
			System.out.println("Enter student's name: ");
			String name = input.next();
			
			
			System.out.println("Enter student's score : ");
			double score = input.nextDouble();
			
			if (score > highestScore ) {
				highestScore = score ;
				studentsName = name ;
			}
		}
		
		System.out.println("Highest score is " + highestScore + " and the student is " + studentsName );
		
	}
}
