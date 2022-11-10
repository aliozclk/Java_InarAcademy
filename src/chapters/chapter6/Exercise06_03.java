package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int num = input.nextInt();

        if(isPalindrome(num)) {
            System.out.println(num + " is a Palindrome number.");
        }else {
            System.out.println(num+ " is not a palindrome number.");
        }
    }


    public static boolean isPalindrome(int number) {
        return number == reverse(number) ;
    }

    public static int reverse(int number) {
        String num = Integer.toString(number);
        String reversed = "";
        for (int i = num.length()-1 ; i >= 0 ; i--){
            reversed += num.charAt(i);
        }
        
        return Integer.parseInt(reversed);

    }
}
