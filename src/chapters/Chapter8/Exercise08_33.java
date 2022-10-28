package chapters.Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3 , x4 , y4: ");
        readThem(points, input);

        double[] area = new double[4];

        double[] centerPoint = getIntersectingPoint(points);
        for (int triangle = 0; triangle < points.length; triangle++) {
            area[triangle] = getArea(points , triangle , centerPoint);
        }

        Arrays.parallelSort(area);
        printArray(area);

    }

    public static void readThem(double[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static double[] getIntersectingPoint(double[][] points){

        double[] intersectingPoint = new double[2];
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[2][0];
        double y2 = points[2][1];
        // Line two is point 2 to point 4
        double x3 = points[1][0];
        double y3 = points[1][1];
        double x4 = points[3][0];
        double y4 = points[3][1];
        /* ------ Cramer's Rule for 2 x 2 Linear Equations ------ */
        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;
        intersectingPoint[0] = Dx / D;
        intersectingPoint[1] = Dy / D;

        return intersectingPoint;
    }

    public static double getArea(double[][] points , int triangle , double[] center){
        double x1 = points[triangle][0];
        double y1 = points[triangle][1];
        if(triangle == 3){
            triangle = -1 ;
        }
        double x2 = points[triangle+1][0];
        double y2 = points[triangle+1][1];
        double x3 = center[0];
        double y3 = center[1];

        double side1 =  Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2),0.5);
        double side2 =  Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2 , 2), 0.5 );
        double side3 =  Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1 , 2),0.5);

        double s = (side1 + side2 + side3)/ 2 ;
        double area = Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
        return area;
    }

    public static void printArray(double[] chars) {
        for (int row = 0; row < chars.length; row++) {
                System.out.printf("%.2f%s" , chars[row] , " | ");
        }
        System.out.println();
    }
}
