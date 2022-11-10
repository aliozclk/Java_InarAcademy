package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int num = input.nextInt();

        reverse(num);
    }



    public static void reverse(int number) {
        String num = Integer.toString(number);
        String reversed = "";
        for (int i = num.length()-1 ; i >= 0 ; i--){
            reversed += num.charAt(i);
        }

        System.out.println(reversed);

    }
}
