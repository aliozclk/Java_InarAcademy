package chapters.chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches:");
		double height = input.nextDouble();
		
		weight *= 0.45359237;
		height *= 0.0254 ;
		double bmi = weight / Math.pow(height, 2) ;
		
		System.out.println("BMI is " + bmi);
		input.close();		
	}

}
