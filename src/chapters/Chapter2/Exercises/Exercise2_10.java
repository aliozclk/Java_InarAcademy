package chapters.Chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms : ");
		double mass = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energy = mass * (finalTemperature - initialTemperature) * 4184 ;
		System.out.println("The energy needed is " + energy);
		input.close();
	}

}
