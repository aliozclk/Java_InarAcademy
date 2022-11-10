package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_26 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter an integer: ");
	        int integer = input.nextInt();

	        boolean fiveAndSix = integer % 5 == 0 && integer % 6 == 0;
	        boolean fiveOrSix = integer % 5 == 0 || integer % 6 == 0;
	        boolean fiveSixNotBoth = (integer % 5 == 0 || integer % 6 == 0) ^ (integer % 5 == 0 && integer % 6 == 0);

	        System.out.println("Is " + integer + " divisible by 5 and 6? " + fiveAndSix);
	        System.out.println("Is " + integer + " divisible by 5 or 6? " + fiveOrSix);
	        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + fiveSixNotBoth);
	 }
}
