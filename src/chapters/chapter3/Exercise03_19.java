package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the sides of a triangle : ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (side3 > (side1 + side2) || side2 > (side1 + side3) || side1  > (side3 + side2)) {
            System.out.println("Invalid Input.");
        } else {
            System.out.println("Perimeter is " + (side1 + side2 + side3));
        }
        input.close();
	
	}

}
