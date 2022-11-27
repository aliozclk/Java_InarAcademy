package chapters.chapter2.exercises;

import java.util.Scanner;

public class Exercise2_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int NumOfYears = input.nextInt();
		
		double currentPopulation = 312032486 ;
		double secondsOfYear = 365 * 24 * 60 * 60  ;
		double birthEvSec = 1.0/7 ;
		double deathEvSec = 1.0 /13 ;
		double immigrantEvSec = 1.0 / 45;
		
			for(int i = 0 ; i < NumOfYears ; i++ ) {
				currentPopulation += (secondsOfYear * (birthEvSec + immigrantEvSec - deathEvSec  ));
			}
			
		System.out.printf("The population in " + NumOfYears + " is ");
		System.out.printf(" %.0f\n ", currentPopulation);
		input.close();
	}
}
