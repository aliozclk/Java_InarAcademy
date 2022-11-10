package chapters.chapter1.Exercises;

public class Exercise1_8 {
	public static void main(String[] args) {
		double radius=5.5;
		double pi= 4* (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) );
		System.out.println("The perimeter for the circle of radius "+ radius + " is : " + 
		(2 * radius * pi));
		System.out.println("The area for the circle of radius " + radius + " is : " +
		(2* pi * (Math.pow(radius,2.0))));
	}
}
