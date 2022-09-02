package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your years of service : ");
		int year = input.nextInt();
		
		if(year >= 5) {
			System.out.println("Enter your salary : ");
			double salary = input.nextDouble();
			
			System.out.println("Your bonus is : " + salary * 1.05);
		}
		else {
			System.out.println("There is no bonus for you.");
		}
	}

}
