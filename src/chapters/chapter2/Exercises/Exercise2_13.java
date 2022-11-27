package chapters.chapter2.exercises;

import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount:");
		double salary = input.nextDouble();

		double montlyInterestRate = 0.05 / 12 ;
		double saving = 0 ;
		
		for ( int month = 1 ; month <= 6 ; month++) {
			saving = (salary + saving) * (1 + montlyInterestRate);
		}
		System.out.println("After the sixth month, the account value is " +
				saving);
		input.close();
	}

}
