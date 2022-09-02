package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_27 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        System.out.println("Enter a point's x- and y-coordinates: ");
	        double x = input.nextDouble();
	        double y = input.nextDouble();

	        if((x == 0 && y <= 100) || (y == 0 && x <= 200 ) || (x <= 200 && y <= 100 && y /(200 -x) <= 0.5))
	        	System.out.println("The point is in the triangle.");
	        else
	        	System.out.println("The point is not in the triangle.");
	        
	        
}
}
