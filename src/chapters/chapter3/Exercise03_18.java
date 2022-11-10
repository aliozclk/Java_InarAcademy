package chapters.chapter3;

import java.util.Scanner;

public class Exercise03_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight of the package : ");
		int weight = input.nextInt();
		
		double cost = 0 ;
		if(weight <= 1)
			cost = 3.5 ;
		else if (weight <= 3)
			cost = 5.5 ;
		else if (weight <= 10)
			cost = 8.5 ;
		else if (weight <= 20)
			cost = 10.5 ;
		if(weight > 50)
			System.out.println("The package cannot be shipped.");
		else
			System.out.println("The cost of shipping is " + cost );
	}

}
