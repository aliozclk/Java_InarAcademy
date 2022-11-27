package chapters.chapter1.exercises;

public class Exercise1_11 {
	public static void main(String[] args) {

	double currentPopulation = 312032486 ;
	double secondsOfYear = 365 * 24 * 60 * 60  ;
	double birthEvSec = 1.0/7 ;
	double deathEvSec = 1.0 /13 ;
	double immigrantEvSec = 1.0 / 45;
	System.out.printf("Current population is : " );
	System.out.printf(" %.0f\n", currentPopulation);
		for(int i = 1 ; i < 6 ; i++ ) {
			currentPopulation += (secondsOfYear * (birthEvSec + immigrantEvSec - deathEvSec  ));
			System.out.printf(i +". year population is :");
			System.out.printf(" %.0f\n ", currentPopulation);

		}
	}
}
