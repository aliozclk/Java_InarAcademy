package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		String point1 = input.nextLine();
		
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		String point2 = input.nextLine();
	
		int comaIndex = point1.indexOf(',');
		int comaIndex2 = point2.indexOf(',');
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		
		if (comaIndex > 0) {
			x1 = Double.parseDouble(point1.substring(0, comaIndex));
			y1 = Double.parseDouble(point1.substring(comaIndex+2));
		}
		if ( comaIndex2 > 0) {
			x2 = Double.parseDouble(point2.substring(0, comaIndex2));
			y2 = Double.parseDouble(point2.substring(comaIndex2+2));
		}
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		double radius = 6371.01;		
		double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) *  
			Math.cos(x2) * Math.cos(y1 - y2 )	);
		
		System.out.println("The distance between the two points is " + distance + " km " );
	}
}
