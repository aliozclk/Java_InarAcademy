package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Enter the matrix row by row: ");
        readThem(matrix, input);

        int[] subMatrixFirstPoint = findLargestBlock(matrix);
        int length = getSubMatrixLength(matrix, subMatrixFirstPoint);

        System.out.println("The maximum square submatrix is at (" + subMatrixFirstPoint[0] + ", " +
                subMatrixFirstPoint[1] + ") with size" + length);
    }



    public static void readThem(int[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextInt();
            }
        }
    }

    public static int[] findLargestBlock(int[][] m){
        int[] subMatrixFirstPoint = new int[2];
        for (int row = 0; row < m.length - 1 ; row++) {
            for (int col = 0; col < m[0].length-1; col++) {
                if(m[row][col] == 0 ){
                    continue;
                }
                if(isSubmatrix(m, row, col)){
                    subMatrixFirstPoint[0] = row;
                    subMatrixFirstPoint[1] = col;
                    return subMatrixFirstPoint;
                }
            }
        }
        return subMatrixFirstPoint;
    }

    public static boolean isSubmatrix(int[][] m, int row, int col) {
        return m[row][col + 1] == 1 && m[row + 1][col] == 1 &&
                m[row + 1][col + 1] == 1;
    }

    public static int getSubMatrixLength(int[][] matrix, int[] subMatrixFirstPoint) {
        int length = 1;
        for (int row = subMatrixFirstPoint[0],col = subMatrixFirstPoint[1] ; row < matrix.length - 1 && col < matrix.length - 1; row++, col++) {
            if(isSubmatrix(matrix,row,col)){
                length++;
            }
        }
        return length;

    }
}
