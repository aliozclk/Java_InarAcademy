package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter ages of three people :");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		
		int max = Math.max(age1, Math.max(age2, age3));
		int min = Math.min(age1, Math.min(age2, age3));
		
		System.out.println("The oldest person is " + max + " aged one.");
		System.out.println("The youngest person is : " + min + " aged one.");
		
	
	}

}
