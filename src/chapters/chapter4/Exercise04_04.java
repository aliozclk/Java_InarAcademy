package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		
		double area = (6 * s * s ) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %.2f\n" , area );
		
	}

}
