package chapters.Chapter4;

import java.util.Scanner;

public class Exercise04_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		
		
		System.out.println("Enter number of hours worked in a week: ");
		double hour = input.nextInt();
		
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double fedRate = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		double staRate= input.nextDouble();
		
		double grossPay = hour * payRate ;
		double fedWith = grossPay * fedRate ;
		double statWith = grossPay * staRate ;
		double total = fedWith + statWith ;
		double net = grossPay - total ;
		
		System.out.println("Employee Name: " + name );
		System.out.println("Hours Worked: " + hour);
		System.out.println("Pay Rate: $" + payRate );
		System.out.println("Gross Pay: $" + grossPay );
		System.out.println("Deductions:\r\n"
				+ "\tFederal Withholding ( " + fedRate * 100 + "%) : $"+ fedWith );
		System.out.println("\tState Withholding ( " +staRate *100 + "%) : $" + statWith );
		System.out.println("\tTotal Deduction: $" + total);
		System.out.println("Net Pay: $" + net);
		
		
		
		
		
	}
}
