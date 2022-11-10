package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        readThem(matrix, input );
        int row = whichRowIsNotEven(matrix);
        int col = whichColIsNotEven(matrix);

        System.out.println("The flipped cell is at (" + row +", " + col + " )");
    }

    public static void readThem(int[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextInt();
            }
        }
    }

    public static int whichRowIsNotEven(int[][] matrix){
        for (int row = 0; row < matrix[0].length; row++) {
            int sum = 0 ;
            for (int col = 0; col < matrix.length; col++) {
                sum += matrix[row][col];
            }

            if(sum % 2 != 0){
                return row;
            }
        }

        return -1;
    }

    public static int whichColIsNotEven(int[][] matrix){
        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0 ;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }

            if(sum % 2 != 0){
                return col;
            }
        }

        return -1;
    }

}
