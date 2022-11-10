package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.nextLine();
        System.out.println("Enter a char :" );
        String s = input.nextLine();

        System.out.println("Number of occurrences of " + s.charAt(0) + " is " + count(str , s.charAt(0)));
    }
    public static int count(String str, char a){
        int count = 0 ;
        for (int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == a ){
                count++;
            }
        }
        return  count;

    }
}
