package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        randomlyFillWith0or1(matrix);
        printArray(matrix);
        sameValueOnRows(matrix);
        sameValueOnColumns(matrix);
        sameValueOnDiagonal(matrix);
        sameValueOnSubDiagonal(matrix);

    }

    private static void sameValueOnSubDiagonal(int[][] matrix) {
        boolean isThereASameValue = false;
        int count = 1 ;
        int temp = matrix[1][0];
        for (int rowAndCol = 2; rowAndCol < matrix.length; rowAndCol++) {
            if(temp == matrix[rowAndCol][rowAndCol-1]){
                count++;
            }

            if (count == 4 ){
                System.out.println("All "+ temp +"s on sub-diagonal ");
                isThereASameValue = true;
            }
        }
        if (!isThereASameValue){
            System.out.println("No same numbers on sub-diagonal");
        }
    }

    private static void sameValueOnDiagonal(int[][] matrix) {
        boolean isThereASameValue = false;
        int count = 1 ;
        int temp = matrix[0][0];
        for (int rowAndCol = 1; rowAndCol < matrix.length; rowAndCol++) {
            if(temp == matrix[rowAndCol][rowAndCol]){
                    count++;
            }

            if (count == 4 ){
                System.out.println("All "+ temp +"s on diagonal ");
                isThereASameValue = true;
            }
        }
        if (!isThereASameValue){
            System.out.println("No same numbers on diagonal");
        }
    }

    public static void sameValueOnColumns(int[][] matrix) {
        boolean isThereASameValue = false;
        for (int col = 0; col < matrix.length; col++) {
            int count = 1 ;
            int temp = matrix[0][col];
            for (int row = 1; row < matrix.length; row++) {
                if(temp == matrix[row][col]){
                    count++;
                }
            }
            if (count == 4 ){
                System.out.println("All "+ temp +"s on column " + col);
                isThereASameValue = true;
            }
        }
        if (!isThereASameValue){
            System.out.println("No same numbers on a column");
        }
    }

    public static void randomlyFillWith0or1(int[][] matrix ){
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int)(Math.random() * 2 );
            }
        }
    }
    public static void printArray(int[][] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].length; col++) {
                System.out.print(chars[row][col] + " | ");
            }
            System.out.println();
        }
    }

    public static void sameValueOnRows(int[][] matrix){
        boolean isThereASameValue = false;
        for (int row = 0; row < matrix.length; row++) {
            int count = 1 ;
            int temp = matrix[row][0];
            for (int col = 1; col < matrix.length; col++) {
                if(temp == matrix[row][col]){
                    count++;
                }
            }
            if (count == 4 ){
                System.out.println("All "+ temp +"s on row " + row);
                isThereASameValue = true;
            }
        }
        if (!isThereASameValue){
            System.out.println("No same numbers on a row");
        }
    }
}
