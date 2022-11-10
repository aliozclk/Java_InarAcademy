package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = input.nextInt();
        System.out.println("Enter width : ");
        int width = input.nextInt();

        System.out.println(format(number,width));

    }
    public static String format(int number, int width){
        String num = Integer.toString(number);
        for (int i = num.length()  ; i < width ; i++) {
            num = "0" + num;
        }
        return num;
    }
}
