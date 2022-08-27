package chapters.Chapter3;

import java.util.Scanner;

public class Exercise03_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		double rectanglex1 = x1 + width / 2 ;
		double rectanglex1Negative = x1 - width / 2 ;
		double rectangley1 = y1 + height / 2 ;
		double rectangley1Negative = y1 - height / 2 ;
		
		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double rectanglex2 = x2 + width2 / 2 ;
		double rectanglex2Negative = x2 - width2 / 2 ;
		double rectangley2 = y2 + height2 / 2 ;
		double rectangley2Negative = y2 - height2 / 2 ;
		
		boolean isInside = rectanglex1 >= rectanglex2 && rectanglex1Negative <= rectanglex2Negative && 
				rectangley1 >= rectangley2 && rectangley1Negative <= rectangley2Negative ;
		
		boolean isOverlap = rectanglex1 < rectanglex2Negative || rectanglex1Negative > rectanglex2 || 
						rectangley1 < rectangley2Negative || rectangley1Negative > rectangley2 ;		
		if(isInside)
			System.out.println("r2 is inside r1");
		else if(isOverlap)
			System.out.println("r2 overlaps r1");
		else 
			System.out.println("r2 does not overlap r1");
		
		
	}

}
