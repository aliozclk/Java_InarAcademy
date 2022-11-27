package chapters.chapter2.exercises;

import java.util.Scanner;

public class Exercise2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		int totalMinutes = (int) input.nextDouble();
		int minutesInDay = 24 * 60 ;
		int minutesInYear = 365 * minutesInDay ;
		
		System.out.println(totalMinutes + " is approximately " +
				totalMinutes / minutesInYear +" year and "+
				(totalMinutes % minutesInYear)/minutesInDay + " day");
		input.close();
	}

}
