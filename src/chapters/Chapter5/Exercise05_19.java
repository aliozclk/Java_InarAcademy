package chapters.Chapter5;

import java.util.Iterator;

public class Exercise05_19 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 8 ; i++) {
			for(int j = 1 ; j <= 16-2*i ; j++ ) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < i ; k++ ) {
				System.out.printf("%2d",(int)(Math.pow(2, k)), " ");
			}
			for(int t = i-2; t >= 0 ; t -- ) {
					System.out.printf("%2d",(int)Math.pow(2, t) , " ");
				
			}
			System.out.println();
		}
	}

}
