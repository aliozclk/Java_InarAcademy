package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students :");
		int numOfStudents = input.nextInt();
			
		
		double highestScore = 0 ;
		String studentsName = "";
		double secondScore = 0 ;
		String secondStudent = "";
		
		for (int i = 0; i < numOfStudents ; i++) {
			input.nextLine();
			System.out.println("Enter student's name: ");
			String name = input.nextLine();
			
			
			
			System.out.println("Enter student's score : ");
			double score = input.nextDouble();
			
			if (score > highestScore ) {
				secondScore = highestScore ;
				secondStudent = studentsName ;
				highestScore = score ;
				studentsName = name ;
			}else if(score > secondScore ){
				
				secondScore = score ;
				secondStudent = name ;
			}
		}
		
		System.out.println("The highest score is " + highestScore + " and the student is " + studentsName );
		System.out.println("The second highest score is " + secondScore + " and the student is " +secondStudent);
	}
}


