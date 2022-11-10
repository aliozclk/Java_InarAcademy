package chapters.chapter5;

public class Exercise05_10 {
	public static void main(String[] args) {
	int counter = 0 ;	
		for(int i = 100 ; i <= 1000 ; i++) {
			
			
			if(i % 5 == 0 && i % 6 == 0 ) {
				System.out.print(i + " ");
				counter ++ ;
			}
			if( counter == 10) {
				System.out.println();
				counter = 0 ;
			}
			
		}
	}

}
