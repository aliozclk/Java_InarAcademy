package chapters.Chapter4;

import java.util.Scanner;

public class Exercise04_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String str = input.nextLine();
		
		String letter = str.toLowerCase();
		int value = 10 ;
		
		String alphabet = " abcdefghijklmnopqrstuvwxyz";
		int index = alphabet.indexOf(letter);
		
		if(index >= 23 )
			value = 9 ;
		else if(index >= 20)
			value = 8 ;
		else if(index >= 16)
			value = 7 ;
		else if(index >= 13)
			value = 6 ;
		else if(index >= 10)
			value = 5 ;
		else if(index >= 7)
			value = 4 ;
		else if(index >= 4)
			value = 3 ;
		else if(index >= 1)
			value = 2 ;
		else if(index >= 0)
			value = 0 ;
	
		if(value < 10) 
			System.out.println("The corresponding number is " + value);
		else
			System.out.println(str.charAt(0)+ " is an invalid input");
	
	}
	

}
