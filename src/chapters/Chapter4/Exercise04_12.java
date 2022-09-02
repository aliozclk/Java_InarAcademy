package chapters.Chapter4;

import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String str = input.next();
		
		int value = 0 ;
		String asd = str.toLowerCase();
		char ch = asd.charAt(0);
		String bin = "";
		
		if( ch >= '0' && ch <= '9' ) {
			
			value = Integer.parseInt(str);
			bin = Integer.toBinaryString(value);	
			System.out.println("The binary value is " + bin);
			
		
		}
		else if (ch >= 'a' && ch <= 'f' ) {
			switch (ch) {
			case 'a':
				value = 10;
				
				break;
			case 'b':
				value = 11;
				break;
			case 'c' :
				value = 12;
				break ;
			case 'd' :
				value = 13 ;
				break;
			case 'e' : 
				value = 14;
				break;
			case 'f' :
				value = 15;
				break;
			
				
			}
			bin = Integer.toBinaryString(value);	
			System.out.println("The binary value is " + bin);
		}
		else 
			System.err.println(str + "is invalid input ");
	}
		
}

