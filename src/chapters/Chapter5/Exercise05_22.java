package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.println("Number of Years: ");
		double years = input.nextDouble();
		System.out.println("Annual Interst Rate : ");
		double annualInterestRate = input.nextDouble();
		System.out.println();
		
		double monthlyInterestRate = annualInterestRate / 1200 ;
		double monthlyPayment = amount * monthlyInterestRate / (1
				 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		double totalPayment = monthlyPayment * years * 12;
		
		System.out.printf("%s%5.2f\n","Monthly Payment: " , monthlyPayment );
		System.out.printf("%s%7.2f\n","Total Payment: " , totalPayment );
		System.out.println();
		
		System.out.printf("%-12s%-12s%-15s%-8s\n", "Payment#", "Interest", "Principal", "Balance");
		double balance = amount ;
		double interest;
		double principal;

		for(int month = 1 ; month <= 12 * years ; month++ ) {
			
			interest = monthlyInterestRate * balance ;
			principal = monthlyPayment - interest ;
			balance = balance - principal ;
			
			System.out.printf("%-12d%-12.2f%-15.2f%-8.2f\n", month , interest , principal , balance);
			
			
		}
			
		
	}
	
	
	
}
