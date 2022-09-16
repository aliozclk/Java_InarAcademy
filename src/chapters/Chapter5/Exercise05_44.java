package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a short integer: ");
        short num = input.nextShort();

        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (num & 1) + bits;
            num >>= 1;
        }
        input.close();
        System.out.println("The bits are " + bits);
    }
}
