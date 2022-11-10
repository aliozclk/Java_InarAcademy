package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int upperCase = 0 ;
        for (int i = 0 ; i < str.length() ; i++ ){
            if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'){
                upperCase++;
            }
        }

        System.out.println("The number of uppercase letters is " + upperCase );
    }
}

