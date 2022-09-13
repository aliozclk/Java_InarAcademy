package chapters.Chapter5;

public class Exercise05_07 {
	public static void main(String[] args) {
		
		int tuition = 10_000 ;
		
		for (int i = 0 ; i < 10 ; i++ ) {
			tuition *= 1.05 ;
		}
		double sum = 0 ;
		for (int i = 0 ; i < 4 ; i++ ) {
			
			tuition *= 1.05 ;
			
			sum += tuition ;
		}
		
		System.out.println("The total cost is " + sum );
	}

}
