package chapters.Chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();
		System.out.println(feet + "Feet is " + 
		0.305 * feet + " Meters.");
		
		input.close();
	}
}
