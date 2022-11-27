package chapters.chapter2.exercises;

import java.util.Scanner;

public class Exercise2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		System.out.println("Enter number of years: ");
		double year = input.nextDouble();
		input.close();
		
		double total = amount * Math.pow((1 + interestRate / 1200), year * 12 );
		System.out.println("Accumulated value is " + total);
	}

}
