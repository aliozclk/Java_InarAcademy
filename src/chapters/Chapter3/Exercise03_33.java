package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		
		boolean isOnLine =  
			!(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
			((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
			(x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));


		
		System.out.print("(" + x2 + ", " + y2 + ") is ");
		if (!isOnLine)
			System.out.print("not ");
		System.out.println("on the line segment from (" + x0 + ", " + y0 + 
			") to (" + x1 + ", " + y1 + ")");
	}
}
