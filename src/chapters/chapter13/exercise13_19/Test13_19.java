package chapters.chapter13.exercise13_19;

import java.math.BigInteger;
import java.util.Scanner;

public class Test13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        String num = input.nextLine();

        String[] parts = num.split(",");


        Rational rational = new Rational(new BigInteger(parts[0]),BigInteger.ONE);
        rational = rational.add(new Rational(new BigInteger(parts[1]),BigInteger.valueOf((long)Math.pow(10,parts[1].length()))));

        System.out.println("The fraction number is "  + rational.toString());

    }
}
