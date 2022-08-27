package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_20 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		double temperature = input.nextDouble();
		
		if(temperature < -58 || temperature > 41) {
			System.out.println("Invalid temperature.");
			System.exit(1);
		}
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		if(windSpeed > 2) {
			System.out.println("Invalid wind speed.");
			System.exit(1);
		}
		
		double windChill = 35.74 + (0.6215 * windSpeed) - 35.75 * Math.pow(windSpeed, 0.16) + 
			0.4275 * (temperature * Math.pow(windSpeed, 0.16));
		System.out.println("The wind chill index is " + windChill);
		input.close();
	}

}
