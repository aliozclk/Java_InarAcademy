package chapters.Chapter6;

import java.util.Scanner;

public class Exercise06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double s = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(s));


    }

    public static double area(double side){

        double area =( 5 * Math.pow(side, 2 ) ) / (4 * Math.tan(Math.PI / 5 ));
        return area;
    }
}

