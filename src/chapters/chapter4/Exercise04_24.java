package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.println("Enter the second city: ");
		String city2 = input.nextLine();
		
		System.out.println("Enter the third city: ");
		String city3 = input.nextLine();
		
		String temp = "";
	
		if(city1.compareToIgnoreCase(city2) > 0) {
			temp = city1 ;
			city1 = city2;
			city2 = temp;
			
		}
		if(city2.compareToIgnoreCase(city3) > 0) {
			temp = city2 ;
			city2 = city3 ;
			city3 = temp ;
		}
		if(city1.compareToIgnoreCase(city2) > 0) {
			temp = city1 ;
			city1 = city2;
			city2 = temp;
			
		}
		System.out.println("The three cities in alphabetical order are " +
				city1 +" "+ city2 +" "+ city3);
	}	
}
