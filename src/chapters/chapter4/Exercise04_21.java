package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String str = input.nextLine();
		
		boolean isValid = true;
		
		if(str.length() != 11 ) {
			isValid = false ;
		}
		else
			isValid = true;			
			for (int i = 0; i < str.length(); i++) {
				if(i == 3 || i == 6 )
					i++;
				if(!Character.isDigit(str.charAt(i)))
					isValid = false ;
			}
						
		
		if(isValid)
			System.out.println( str + " is a valid social security number");
		else
			System.out.println(str + " is an invalid social security number");
		
		
	}

}
