package chapters.Chapter5;

public class Exercise05_25 {
	public static void main(String[] args) {
		

		double i = 1 ;
		double quarterPi = 0;
		
		while( i <= 10000 ) {
			quarterPi += Math.pow(-1,(i + 1)) /( 2*i - 1) ;
			
			i++;
		
		}
		System.out.println(4*quarterPi );
		
		while( i <= 20000 ) {
			quarterPi += Math.pow(-1,(i + 1)) /( 2*i - 1) ;
			
			i++;
		}
		System.out.println(4*quarterPi );
		
		while( i <= 50000 ) {
			quarterPi += Math.pow(-1,(i + 1)) /( 2*i - 1) ;
			
			i++;
		}
		System.out.println(4*quarterPi );
		
		
	}
		

}
