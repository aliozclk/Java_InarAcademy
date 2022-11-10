package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.print("The reversed string is " );
        for (int j = str.length()-1  ; j >= 0   ;  j--){
            System.out.print( str.charAt(j));
        }
        System.out.println();
    }
}
