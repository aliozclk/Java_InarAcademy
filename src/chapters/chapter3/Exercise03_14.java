package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter '0' for head or, '1' for tail: ");
		int guess = input.nextInt();
		
		int coinSide = (int)(Math.random() * 2);
		
		if(guess == coinSide )
			System.out.println("The guess is correct.");
		else
			System.out.println("The guess is incorrect.");
	}
}
