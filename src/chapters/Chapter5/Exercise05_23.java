package chapters.Chapter5;

public class Exercise05_23 {
	public static void main(String[] args) {
		
		double sum = 0 ;
		
		for(double n = 1 ; n <= 50000 ; n++ ) {
			sum += 1/n;
		}
		
		System.out.println("Left to right : " + sum);
		
		for(double n = 50000 ; n > 0 ; n-- ) {
			sum += 1/n;
		}
		
		System.out.println("Right to left : " + sum);
	}

}
