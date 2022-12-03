package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (Math.pow(b, 2)) - (4 * a * c );

		if( discriminant < 0) {
			System.out.println("The equation has no real roots.");
		} else if ( discriminant == 0) {
			System.out.println("The equation has one root"+ (-b + Math.pow(discriminant,0.5)) /(2 * a ) ) ;
			
		}else {
			double r1 = (-b + Math.pow(discriminant,0.5)) /(2 * a );
			double r2= (-b - Math.pow(discriminant,0.5)) /(2 * a );
			System.out.println("The equation has two roots " + r1 + " " + r2 ) ;
		}
		input.close();
	}

}
