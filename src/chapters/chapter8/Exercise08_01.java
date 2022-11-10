package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] numbers = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        readThem(numbers,input);

        for (int col = 0; col < numbers[0].length ; col++) {
            double sum = sumColumn(numbers , col);
            System.out.println("Sum of the elements at column" + col + " is " + sum);
        }

    }
    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0 ;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }

        return sum;
    }
}
