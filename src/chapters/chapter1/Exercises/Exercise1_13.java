package chapters.chapter1.exercises;

public class Exercise1_13 {
	public static void main (String[] args) {
		
		double a = 3.4 ;
		double b = 50.2 ;
		double c = 2.1 ;
		double d = 0.55 ;
		double e = 44.54 ;
		double f = 5.9 ;
		
		double x = ( e * d - b * f ) / ( a * d - b * c ) ;
		double y = ( a * f - e * c ) / ( a * d - b * c ) ;
		System.out.println("X : " + x) ;
		System.out.println("Y : " + y);
	}

}
