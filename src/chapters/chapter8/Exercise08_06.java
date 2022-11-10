package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.println("Enter two 3 * 3 matrices");
        System.out.println("Enter matrix1: ");
        readThem(matrix1,input);
        System.out.println("Enter matrix2: ");
        readThem(matrix2,input);

        double[][] totalMatrix ;
        totalMatrix = multiplyMatrix(matrix1,matrix2);
        System.out.println("The matrices are added as follows ");
        printArray(matrix1,matrix2,totalMatrix);
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] total = new double[3][3];

        for (int totalRow = 0; totalRow < total.length; totalRow++) {
            for (int row_col = 0; row_col < total[totalRow].length; row_col++) {
                for (int col = 0; col < total[row_col].length; col++) {
                    total[totalRow][row_col] +=  a[totalRow][col] * b[col][row_col];
                }
            }


        }
        return total;

    }

    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }
    public static void printArray(double[][] m1, double[][] m2 , double[][] m3){
        for (int row = 0; row < m2.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                System.out.print(m1[row][col]  + " | ");
            }

            if (row == 1 ){
                System.out.print("  *   ");
            }else {
                System.out.print("\t\t");
            }
            for (int col= 0; col < m2[row].length; col++) {
                System.out.print(m2[row][col]  + " | ");
            }

            if (row == 1){
                System.out.print("  =   ");
            }else {
                System.out.print("\t\t");
            }
            for (int col = 0; col < m3[row].length; col++) {
                System.out.printf("%2.1f | ",m3[row][col]);
            }
            System.out.println();
        }
    }
}
