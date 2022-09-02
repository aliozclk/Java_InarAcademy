package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter month:(1-12) ");
		int month = input.nextInt();
		System.out.println("Enter the day of the month: ");
		int dayOfMonth = input.nextInt();

		if(month == 1 ) {
			month = 13 ;
			year--;
		}
		if(month == 2) {
			month = 14 ;
			year--;
		}
		
		int dayOfWeek = (dayOfMonth + (( 26 * month + 26) / 10) + (year % 100) + 
				(year % 100)/ 4 + (year / 100)/4 + 5 * (year / 100) )% 7 ;
		String day = "";
		
		switch (dayOfWeek) {
		case 0:
			day = "Saturday"; 			
			break;
		case 1:
			day = "Sunday" ;			
			break;
		case 2:
			day = "Monday" ;			
			break;
		case 3:
			day = "Tuesday"; 			
			break;
		case 4:
			day = "Wednesday" ;			
			brek;
		case 5:
			day = "Thursday" 		;	
			break;
		case 6:
			day = "Friday" 	;		
			break;
			
		a
		}
		System.out.println("Day of the week is " + day );
	}

}
