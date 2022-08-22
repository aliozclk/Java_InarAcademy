package chapters.Chapter2;

import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = (input.nextDouble());
		double gratuity = gratuityRate / 100 ;
		
		System.out.println("The gratuity is " + subtotal * gratuity +
				" and total is " + (subtotal + subtotal * gratuity) );
		input.close();
	}
}
