package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sides of Triangle : ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        if(MyTriangle.isValid(s1,s2,s3)){
            System.out.println("The area of triangle is " + MyTriangle.area(s1,s2,s3));
        }
        else {
            System.out.println("The input is invalid.");
        }


    }
}


class MyTriangle{
    /** Return true if the sum of any two sides is
     * greater than the third side. */
    public static boolean isValid(
            double side1, double side2, double side3){

        return (side1+side2 > side3 ) && (side1 + side3 > side2) && (side2 + side3 > side1);


    }
    /** Return the area of the triangle. */
    public static double area(
            double side1, double side2, double side3){

        double s = (side1 + side2 + side3)/ 2 ;
        return Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
    }
}
