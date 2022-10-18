package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] numbers = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        readThem(numbers,input);
        double sum = sumMajorDiagonal(numbers);

        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }

    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0 ;
        for (int rowAndCol = 0; rowAndCol < m.length; rowAndCol++) {
            sum += m[rowAndCol][rowAndCol];
        }
        return sum;
    }

}
