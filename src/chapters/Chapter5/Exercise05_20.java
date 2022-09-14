package chapters.Chapter5;

public class Exercise05_20 {
	public static void main(String[] args) {
		
		int counter = 1 ;
		for(int num = 2 ; num <= 1000 ; num++ ) {
			boolean isPrime = true;
			for(int divisor = num - 1 ; divisor > 1 ; divisor --) {
				if(num % divisor == 0 ) {
					isPrime = false ;
				}
			}
			if(isPrime) {
				System.out.print(num + " ");
				counter++;
			}
			
			if(counter % 9 == 0 ) {
				System.out.println();
				counter = 1 ;
			}
		}
	}
}
