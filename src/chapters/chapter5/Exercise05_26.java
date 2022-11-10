package chapters.chapter5;

public class Exercise05_26 {
	public static void main(String[] args) {
		double sum = 1 ;
		
		for (double i = 1 ; i <= 10_000 ; i++ ) {
			
			double factoriel = 1 ;
			
			for( double j = i ; j > 0 ; j-- ) {
				
				factoriel *=  j ;
				
			}
			
			sum += 1 /  factoriel ;
		}
		
		System.out.println("e : " + sum);
		
		sum = 1 ;
		for (double i = 1 ; i <= 20_000 ; i++ ) {
			
			double factoriel = 1 ;
			
			for( double j = i ; j > 0 ; j-- ) {
				
				factoriel *=  j ;
				
			}
			
			sum += 1 /  factoriel ;
		}
		
		System.out.println("e : " + sum);

		sum = 1 ;
		for (double i = 1 ; i <= 100_000 ; i++ ) {

			double factoriel = 1 ;

			for( double j = i ; j > 0 ; j-- ) {

				factoriel *=  j ;

			}

			sum += 1 /  factoriel ;
		}

		System.out.println("e : " + sum);
	}

}
