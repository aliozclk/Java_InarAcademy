package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        readThem(matrix, input);

        sortRows(matrix);

        printArray(matrix);

    }

    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static double[][] sortRows(double[][] m){
        for (int rows = 0; rows < m.length; rows++) {
            for (int i = 0; i < m.length; i++) {
                int minIndex = -1;
                double min = Double.MAX_VALUE;
                for (int j = i; j < m.length ; j++) {

                    if(m[rows][j] < min){
                        min = m[rows][j] ;
                        minIndex = j ;
                    }
                }
                double temp = 0;
                temp = m[rows][i];
                m[rows][i] = m[rows][minIndex];
                m[rows][minIndex] = temp;
            }
        }

        return m;
    }

    public static void printArray(double[][] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].length; col++) {
                System.out.print(chars[row][col] + " | ");
            }
            System.out.println();
        }
    }

}
