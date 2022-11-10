package chapters.chapter4;

import java.util.Scanner;

public class Exercise04_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		String str = input.nextLine();
		
		String student = "";
		switch (str.toUpperCase().charAt(0)) {
		case 'M' :
			student += "Mathematics ";
			break;
		case 'C':
			student += "Computer Science ";
			break;
		case 'I':
			student += "Information Technology ";
			break;
		
		}
		switch (str.charAt(1)) {
		case '1':
			student += "Freshman";
			break;
		case '2':
			student += "Sophomore";
			break;
		case '3':
			student += "Junior";
			break;
		case '4':
			student += "Senior";
			break;

		}
		System.out.println(student);
	}

}
