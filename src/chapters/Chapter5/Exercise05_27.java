package chapters.Chapter5;

public class Exercise05_27 {
	public static void main(String[] args) {
		
		int numberOfLeap = 0 ;
		int counter = 0 ;
		
		for( int year = 101 ; year <= 2001 ; year++ ) {
			
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print( year + " " );
				counter++ ;
				numberOfLeap ++ ;
				
				if(counter % 10 == 0 ) {
					System.out.println();
					
				}
			}
			
		}
		System.out.println("\nNumber of leap years is " + numberOfLeap );
	}
}
