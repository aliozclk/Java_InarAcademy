package chapters.Chapter4;

import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String str = input.next();
		
		String vowels = "aeiou";
		String consonants = "bcdfghjklmnpqrstvyzwx";
		
				
		for (int i = 0; i < vowels.length(); i++) {
			if(str.charAt(0) == vowels.charAt(i)) {
				System.out.println(str.charAt(0)+" is a vowel. ");
				System.exit(1);
			}
			
		}
		for (int i = 0; i < consonants.length(); i++) {
			if (str.charAt(0) == consonants.charAt(i)) {
				System.out.println(str.charAt(0)+" is a consonant. ");
				System.exit(1);
			}
			
		}
		
		System.err.println("Invalid input.");
		
	}

}
