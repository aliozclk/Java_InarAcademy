package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit number : ");
		int num = input.nextInt();
		
		int num1 = (num / 1000) ;
		int num2 = (num / 100 % 10) * 10 ;
		int num3 = (num / 10 % 10) * 100 ;
		int num4 = (num % 10) * 1000 ; 
		int newNum = num1 + num2 + num3 + num4 ;
		
		System.out.println("The transformed number is : " + newNum);
	}
}
