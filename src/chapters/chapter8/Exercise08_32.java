package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        readThem(points, input);

        double area = getTriangleArea(points);
        if(area != 0){
            System.out.println("The area of the triangle is " + area);
        }else {
            System.out.println("The three points are on the same line");
        }
    }

    public static void readThem(double[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static double getTriangleArea(double[][] points){
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];

        double side1 =  Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2),0.5);
        double side2 =  Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2 , 2), 0.5 );
        double side3 =  Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1 , 2),0.5);

        double s = (side1 + side2 + side3)/ 2 ;
        double area = Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
        return area;
    }
}
