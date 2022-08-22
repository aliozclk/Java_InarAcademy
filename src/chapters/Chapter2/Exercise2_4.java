package chapters.Chapter2;

import java.util.Scanner;

public class Exercise2_4 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number in pounds : ");
	
	double pounds = input.nextDouble();
	System.out.println(pounds + " pounds is " + pounds * 0.454 +
			" kilograms .");
	input.close();
	}
	

}
