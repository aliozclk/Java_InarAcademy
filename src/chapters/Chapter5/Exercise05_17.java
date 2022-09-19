package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int lines = input.nextInt();
		
		
		for(int i = 1 ; i <= lines ; i++) {
			for(int j = i * 2  ; j <=( lines * 2) ; j++ ) {
				System.out.printf("  ");
			}
		
			for( int t =  i  ; t > 0 ; t--){
				System.out.printf("%4d", t);
				System.out.print("");
				
			}
			for (int k = 2 ; k <= i ; k++ ) {
				System.out.printf("%4d", k , " ");
			}
			System.out.println();
		}
	}

}
