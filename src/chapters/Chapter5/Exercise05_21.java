package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.println("Number of Years: ");
		double years = input.nextDouble();
		
		System.out.printf("%-18s%-18s%-18s\n\n","Interest Rate","Monthly Payment","Total Payment");
	
		for(double interestRate = 5.0 ; interestRate <= 8.0 ; interestRate += 0.125 ) {
			double monthlyInterestRate = interestRate / 1200 ;
		
			double monthlyPayment = amount * monthlyInterestRate / (1
				 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
			double totalPayment = monthlyPayment * years * 12;
			
			System.out.printf("%-18.3f%-18.2f%-18.2f\n", interestRate , monthlyPayment , totalPayment);
			
		
		}
	
	
	}

}
