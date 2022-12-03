package chapters.chapter13.exercise13_20;

import java.util.Scanner;

public class Test13_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (Math.pow(b, 2)) - (4 * a * c );

		if( discriminant < 0) {
			printImaginaryRoots(a,b);
		} else if ( discriminant == 0) {
			System.out.println("The root is "+ (-b + Math.pow(discriminant,0.5)) /(2 * a ) ) ;
			
		}else {
			double r1 = (-b + Math.pow(discriminant,0.5)) /(2 * a );
			double r2= (-b - Math.pow(discriminant,0.5)) /(2 * a );
			System.out.println("The roots are " + r1 + " " + r2 ) ;
		}
		input.close();
	}

	public static void printImaginaryRoots(double a, double b){
		System.out.print("The roots are ");
		Complex r1 = new Complex(-b / (2 * a) , Math.sqrt(2 * a));
		Complex r2 = new Complex(-b / (2 * a) , -Math.sqrt(2 * a));
		System.out.println(r1.toString() + " and " + r2.toString());
	}

}
