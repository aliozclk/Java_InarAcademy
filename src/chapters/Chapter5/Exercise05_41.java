package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -1;
        int counter = 1 ;
        int num = -2 ;
        do {
            System.out.println("Enter numbers: ");
            num = input.nextInt() ;

            if(num > max ){
                max = num ;
            } else if (num == max ) {
                counter++ ;

            }

        }while (num != 0);

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + counter );



    }
}
