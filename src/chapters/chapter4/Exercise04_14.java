package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		String str = input.next();
		
		String grade = str.toLowerCase();
		char ch = grade.charAt(0);
		
		int value = 0;
		
		
		switch (ch) {
		case 'a':
			value = 4 ;
			break;
		case 'b':
			value = 3 ;
			break;
		case 'c':
			value = 2 ;
			break;
		case 'd':
			value = 1 ;
			break;
		
		default:
			System.out.println(str.charAt(0)+ "  is an invalid grade");
			System.exit(1);
			break;
		}
		System.out.println("The numeric value for grade " + str.charAt(0) +
				" is " + value );
	}

}
