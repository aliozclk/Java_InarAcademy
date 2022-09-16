package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int checkSum = 0 ;

        int isbnNum = isbn ;
        boolean isFirstZero = isbn < 1_000_000_000 ? true : false ;

        for (int step = isFirstZero ?  2  : 1 ; step <= 9 ; step++ ){

            int stepNumber =  ((isbnNum  / (int)Math.pow(10 , 9 - step )) % 10 ) ;
            checkSum += stepNumber * step ;
        }

        checkSum %= 11 ;

        System.out.println( (isFirstZero ? "0" : "") + isbn + (checkSum  == 10 ? "X" : "" + checkSum  ));

    }
}
