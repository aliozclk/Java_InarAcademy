package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        int checkSum = 0 ;

        if (isbn.length() < 12 ){
            System.err.println("Invalid input");
            System.exit(1);
        }
        for (int step = 0 ; step < isbn.length() ; step++ ){
            if ( step % 2 != 0 ) {
                checkSum += Integer.parseInt(Character.toString(isbn.charAt(step))) * 3;
            }else {
                checkSum += Integer.parseInt(Character.toString(isbn.charAt(step)));
            }

        }
        checkSum = 10 - checkSum % 10 ;



        System.out.println("The ISBN-13 number is " + isbn + "" +( checkSum == 10 ? '0' : "" + checkSum  ));

    }
}
