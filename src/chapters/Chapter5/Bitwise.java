package chapters.Chapter5;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        System.out.print("Enter a short integer: ");
        short num = 4;

        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (num & 1) + bits;
            num >>= 1;
        }

        System.out.println("The bits are " + bits);
    }
}
