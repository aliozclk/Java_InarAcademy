package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int num = input.nextInt();
		
		for(int i = 2 ; i < num ; i++) {
			boolean isPrime = true;
			for(int j = 2 ; j < num ; i++) {
				if(i % i == 0) {
					isPrime = true;
				}
				else if (i % j == 0) {
					isPrime = false ;
				}
			
			
				if(!isPrime) {
				continue;
				}
				while ( num % i == 0) {
				num /= i ;
				System.out.print(i + ", ");
				}
			}
		}
		
	}

}
