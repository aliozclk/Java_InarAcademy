package chapters.Chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double velocity = input.nextDouble();
		double acceleration = input.nextDouble();
		double length = Math.pow(velocity, 2) / (2 * acceleration);
		
		System.out.printf("The minimum runway length for this airplane is " );
		System.out.printf(" %.3f\n ",length);
		input.close();
		
	}
}
