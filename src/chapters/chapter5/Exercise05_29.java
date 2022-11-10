package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_29 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year : ");
		int year = input.nextInt();
		System.out.println("Enter number of day : ");
		int day = input.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		
		for( int month = 1 ; month <= 12 ; month++ ) {
			String monthStr = "";
			String dayStr = "";
			int lastDay = 0 ;
			switch (month) {
			case 1:
				monthStr = "January";
				lastDay = 31 ;
				break;
				
			case 2:
				monthStr = "Fabruary";
				day = (day + 31) % 7 ;
				if(isLeapYear) {
					lastDay = 29 ;
				}else
					lastDay = 28 ;
				break;
			case 3:
				monthStr = "March";
				if(isLeapYear) {
					day = (day + 29) % 7 ;
				}else
					day = (day + 28) % 7 ;
				lastDay = 31 ;
				break;
			case 4:
				monthStr = "April";
				day = (day + 31) % 7 ;
				lastDay = 30 ;
				break;
			case 5:
				monthStr = "May";
				day = (day + 30) % 7 ;
				lastDay = 31 ;
				break;
			case 6:
				monthStr = "June";
				day = (day + 31) % 7 ;
				lastDay = 30 ;
				break;
			case 7:
				monthStr = "July";
				day = (day + 30) % 7 ;
				lastDay = 31 ;
				break;
			case 8:
				monthStr = "August";
				day = (day + 31) % 7 ;
				lastDay = 31 ;
				break;
			case 9:
				monthStr = "September";
				day = (day + 31) % 7 ;
				lastDay = 30 ;
				break;
			case 10:
				monthStr = "October";
				day = (day + 30) % 7 ;
				lastDay = 31 ;
				break;
			case 11:
				monthStr = "November";
				day = (day + 31) % 7 ;
				lastDay = 30 ;
				break;
			case 12:
				monthStr = "December" ;
				day = (day + 30) % 7 ;
				lastDay = 31 ;
				break;
			}
			
			
			System.out.printf("%10s%s%d\n" ," " ,monthStr, year);
			
			for(int i = 0 ; i < 40 ; i++ ) {
				System.out.print("_");
			}
			System.out.println();
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			for(int j = 0 ; j < day ; j++) {
				System.out.print("   \t");
			}
			
			for(int k = 1 ; k <= lastDay ; k++ ) {
				System.out.printf("%-3d\t" , k);
				if((day + k ) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
	
			
		}
    }

}
