package chapters.chapter13.exercise13_17;

import java.util.Scanner;

public class Test13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the first complex number:");
        double firstReal = input.nextDouble();
        double firstImaginary = input.nextDouble();
        System.out.println("Enter the second complex number:");
        double secondReal = input.nextDouble();
        double secondImaginary = input.nextDouble();

        Complex c1 = new Complex(firstReal,firstImaginary);
        Complex c2 = new Complex(secondReal,secondImaginary);

        String print = c1.toString() + " + " + c2.toString() + " = ";
        System.out.println(print + c1.add(c2).toString());

        print = c1.toString() + " - " + c2.toString() + " = ";
        System.out.println(print + c1.subtract(c2).toString());

        print = c1.toString() + " * " + c2.toString() + " = ";
        System.out.println(print + c1.multiply(c2).toString());

        print = c1.toString() + " / " + c2.toString() + " = ";
        System.out.println(print + c1.divide(c2).toString());

        print = "| " + c1.toString() + " | = " + c1.abs();
        System.out.println(print);
    }

}
