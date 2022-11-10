package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a decimal value : ");
		int value = input.nextInt();
		
		char ch = ' ';
		if(16 > value ) {
			if(9 < value ) {
				switch (value) {
				case 10:
					ch = 'A';
					break;
				case 11:
					ch = 'B';
					break;
				case 12:
					ch = 'C';
					break;
				case 13:
					ch = 'D';
					break;
				case 14:
					ch = 'E';
					break;
				case 15:
					ch = 'F';
					break;
				
				}
			System.out.println("The hex value is " + ch);	
			}
			else
			System.out.println("The hex value is " + value);	
		}else
			System.err.println("The invalid input.");
	}

}
