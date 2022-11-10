package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean rectangle = (5.0 >= x && x >= -5.0 )&& ( 2.5 >= y && -2.5 <= y );
		
		if(rectangle)
			System.out.println("Point " + x + " " + y + " is in the rectangle"); 
		else 
			System.out.println("Point " + x + " " + y + " is not in the rectangle");
	}
}
