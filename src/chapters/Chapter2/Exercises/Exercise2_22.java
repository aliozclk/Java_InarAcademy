package chapters.Chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_22 {
	public static void main(String[] args) {   
	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Receive the amount 
	    System.out.println(
	      "Enter an amount in integer, last two numbers for cents ,for example 1156 for 11.56: ");
	    int amount = input.nextInt();
	    input.close();
	   
	    
	    int remainingAmount = amount ;// Find the number of one dollars
	    int numberOfOneDollars = remainingAmount / 100;
	    remainingAmount = remainingAmount % 100;

	    // Find the number of quarters in the remaining amount
	    int numberOfQuarters = remainingAmount / 25;
	    remainingAmount = remainingAmount % 25;

	    // Find the number of dimes in the remaining amount
	    int numberOfDimes = remainingAmount / 10;
	    remainingAmount = remainingAmount % 10;

	    // Find the number of nickels in the remaining amount
	    int numberOfNickels = remainingAmount / 5;
	    remainingAmount = remainingAmount % 5;

	    // Find the number of pennies in the remaining amount
	    int numberOfPennies = remainingAmount;

	    // Display results
	    System.out.println("Your amount " + amount + " consists of"); 
	    System.out.println("    " + numberOfOneDollars + " dollars");
	    System.out.println("    " + numberOfQuarters + " quarters ");
	    System.out.println("    " + numberOfDimes + " dimes"); 
	    System.out.println("    " + numberOfNickels + " nickels");
	    System.out.println("    " + numberOfPennies + " pennies");
	}
}

