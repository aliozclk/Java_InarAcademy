package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int num = 1 ;
		int positiveCounter = 0 ;
		int negativeCounter = 0 ;
		int total = 0 ;
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		
		while ( num != 0 ) {
			num = input.nextInt();
			
			if(num < 0 )
				negativeCounter++ ;
			else if (num > 0)
				positiveCounter++;
		
			total += num;
		}
		double average = (total / (double)(positiveCounter + negativeCounter)) ;

		System.out.println("The number of positives is " + positiveCounter );
		System.out.println("The number of negatives is " + negativeCounter );
		System.out.println("The total is " + total );
		System.out.println("The average is " + average);
	}

}
