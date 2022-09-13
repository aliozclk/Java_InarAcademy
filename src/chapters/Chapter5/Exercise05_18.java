package chapters.Chapter5;

public class Exercise05_18 {
	public static void main(String[] args) {
		
		patternA();
		patternB();
		patternC();
		patternD();
	}
	
	public static void patternA() {
		System.out.println("Pattern A :");
		for(int i =1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
			System.out.print(j +  " ");
			}
			System.out.println();
		}
			
	}
	public static void patternB() {
		System.out.println("Pattern B : ");
		
		for(int i = 6 ; i >= 1 ; i--) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void patternC() {
		System.out.println("Pattern C :");
		
		for(int i = 1 ; i <= 6 ; i++ ) {
			for(int j = i*2 ; j <= 12 ; j++ ) {
				System.out.print(" ");
			}
			for(int k = i ; k > 0 ; k-- ) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	public static void patternD() {
		System.out.println("Pattern D : ");
		
		for(int i = 1 , j = 6 ; i <= 6 ; i++ , j-- ) {
			for (int k = 1 ; k <= (i-1)*2 ; k++ ) {
				System.out.print(" ");
			}
			for(int t = 1 ; t <= j ; t++) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
		
	}
 
}
