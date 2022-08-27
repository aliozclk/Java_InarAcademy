package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_22 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Enter a point with two coordinates: ");
	        double x2 = input.nextInt();
	        double y2 = input.nextInt();

	        double x1 = 0;
	        double y1 = 0;


	        double distanceToCentral = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	        String x= "";
	        if (distanceToCentral <= 10) {
	            x += "is in the circle";
	        } else {
	            x += "is not in the circle";
	        }

	        System.out.println("Point (" + x2 + ", " + y2 + ") " + x);


	}

}
