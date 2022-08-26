package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int day = input.nextInt();
		
		if (day > 6 || day < 0) { 
			System.out.println("Incorrect value. ");
			System.exit(1);
		}
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDay = input.nextInt();
		
		switch (day) {
		case 0 :
			System.out.printf("Today is Sunday");
			break;
		case 1 :
			System.out.printf("Today is Monday");
			break;
		case 2 :
			System.out.printf("Today is Tuesday");
			break;
		case 3 :
			System.out.printf("Today is Wednesday");
			break;
		case 4 :
			System.out.printf("Today is Thursday");
			break;
		case 5 :
			System.out.printf("Today is Friday");
			break;
		case 6 :
			System.out.printf("Today is Saturday");
			break;
		
		}
	
		
		switch ((day + elapsedDay) % 7) {
		case 0 :
			System.out.println(" and the future day is Sunday");
			break;
		case 1 :
			System.out.println(" and the future day is Monday");
			break;
		case 2 :
			System.out.println(" and the future day is Tuesday");
			break;
		case 3 :
			System.out.println(" and the future day is Wednesday");
			break;
		case 4 :
			System.out.println(" and the future day is Thursday");
			break;
		case 5 :
			System.out.println(" and the future day is Friday");
			break;
		case 6 :
			System.out.println(" and the future day is Saturday");
			break;
		
		}
	}

}
