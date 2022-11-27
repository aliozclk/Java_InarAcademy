
package chapters.chapter2.exercises;

import java.util.Scanner;

public class Exercise2_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0, v1, and t: ");
		double velocity0 = input.nextDouble();
		double velocity1 = input.nextDouble();
		double time = input.nextDouble();
		double acceleration = (velocity0 - velocity1) / time ;
		
		System.out.println("The average acceleration is  "
				+ acceleration);
		input.close();
	}
}
