package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String first = input.nextLine();
        System.out.println("Enter the second string: ");
        String second = input.nextLine();

        String common = "";

        for (int i = 0 ; i < first.length() ; i++ ){
            for (int j = i ; j < second.length() ; j++ ){
                if (first.charAt(i) == second.charAt(j) ){
                    common += second.charAt(j);
                    break;
                }
            }
        }
        if (common.length() < 2 ){
            System.out.println(first + " and " + second+ " have no common prefix" );
        }else {
            System.out.println("The common prefix is " + common);
        }
    }
}
