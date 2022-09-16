package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String oddPosition = "";
        for (int i = 0 ; i < str.length() ; i += 2 ){
            oddPosition += str.charAt(i);
        }
        System.out.println(oddPosition);
    }
}
