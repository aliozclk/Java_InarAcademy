package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];
        System.out.println("Enter five points : ");
        readThem(points,input);

        if(sameLine(points)){
            System.out.println("The five points are on the same line ");
        }else {
            System.out.println("The five points are not on the same line");
        }


    }
    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static boolean sameLine(double[][] points){
        for (int i = 0; i < 3; i += 2) {
            double x0 = points[i][0];
            double y0 = points[i][1];
            double x1 = points[i+1][0];
            double y1 = points[i+1][1];
            double x2 = points[i+2][0];
            double y2 = points[i+2][1];

            if(!onTheSameLine(x0,y0,x1,y1,x2,y2))
                return false;
        }
        return true;
    }
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return position == 0;

    }

}
