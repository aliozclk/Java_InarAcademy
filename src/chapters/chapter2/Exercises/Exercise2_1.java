package chapters.chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double celsius = input.nextDouble();
		double fahrenheit =  (9.0 / 5) * celsius + 32 ;
		System.out.println(celsius + " Celsius is " + 
		fahrenheit + " Fahrenheit degree.");
		input.close();
	}
}