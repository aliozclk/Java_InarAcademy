package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter two integers
	    System.out.print("Enter first integer: ");
	    int n1 = input.nextInt();
	    System.out.print("Enter second integer: ");
	    int n2 = input.nextInt();

	    int gcd = Math.min(n1, n2);
	    for(; gcd > 0 ; gcd--) {
	    	if( n1 % gcd == 0 && n2 % gcd == 0) {
	    		break;
	    	}
	    	
	    }

	    System.out.println("The greatest common divisor for " + n1 +
	      " and " + n2 + " is " + gcd);
		
	}

}
