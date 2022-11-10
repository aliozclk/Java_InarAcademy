package chapters.chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int integer = input.nextInt();
		
		System.out.print("The sum of the digits is ");
		System.out.println((integer/100)+((integer%100)/10) + 
				(((integer%100)%10)));
		input.close();
	}		
}