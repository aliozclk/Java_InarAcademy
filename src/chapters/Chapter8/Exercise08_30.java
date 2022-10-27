package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];
        System.out.println("Enter list 1: ");
        readThem(a, input);

        double[] b = new double[2];
        System.out.println("Enter list 2: ");
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();

        double[] result = linearEquation(a,b);
        if(result != null){
            System.out.println("The equation  " +result[0] + " , " + result[1]);
        }else {
            System.out.println("The equation has no solution ");
        }

    }

    public static void readThem(double[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static double[] linearEquation(double[][] a, double[] b){
        double[] result = new double[2];
        if(a[0][0]*a[1][1] - a[1][0]*a[0][1] == 0){
            return null;
        }else {
            result[0] = (b[0]* a[1][1] - b[1]*a[0][1])/ a[0][0]*a[1][1] - a[1][0]*a[0][1] ;
            result[1] = (b[1] * a[0][0] - b[0]* a[1][0] ) / a[0][0]*a[1][1] - a[1][0]*a[0][1] ;
        }

        return result;

    }
}
