package chapters.Chapter4;

import java.util.Scanner;

public class Exercise04_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int y = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter a month: ");
		String month = input.nextLine();
		int day = 0 ;
		
		if ( month.equals("Jan") || month.equals("Mar") || 
				  month.equals("May") || month.equals("Jul") ||
				  month.equals("Aug") || month.equals("Oct") ||
				  month.equals("Dec")) {
			day = 31 ;
		}
		else if (month.equals("Apr") || month.equals("Jun") || 
				month.equals("Sep") || month.equals("Nov")) {
			day = 30 ;
		}
		else if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			day = 29 ;
		}else
			day = 28 ;
		
		System.out.println( month + " has " + day + " days. ");
		
	}

}
