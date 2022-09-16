package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine() ;

        int consonants = 0 ;
        int vowels = 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.toUpperCase(str.charAt(i)) == 'A' ||
                        Character.toUpperCase(str.charAt(i)) == 'E' ||
                        Character.toUpperCase(str.charAt(i)) == 'I' ||
                        Character.toUpperCase(str.charAt(i)) == 'O' ||
                        Character.toUpperCase(str.charAt(i)) == 'U') {
                    vowels++;
                } else
                    consonants++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
