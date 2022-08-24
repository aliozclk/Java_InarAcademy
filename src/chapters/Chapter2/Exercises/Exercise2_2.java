package chapters.Chapter2.Exercises;

import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder:");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = Math.pow(radius, 2) * Math.PI ;
		double volume = area * length  ;
		System.out.println("The area is :" + area +"\n5.5 12The volume is :" + 
		volume );
		input.close();
	}
}
