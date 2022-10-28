package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Enter the matrix row by row: ");
        readThem(matrix, input);

        int[] subMatrix = findLargestBlock(matrix);

        System.out.println("The maximum square submatrix is at (" + subMatrix[0] + ", " +
                subMatrix[1] + ") with size" + subMatrix[2]);
    }

    public static void readThem(int[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextInt();
            }
        }
    }

    public static int[] findLargestBlock(int[][] m){
        int[] subMatrix = new int[3];
        for (int row = 0; row < m.length - 1 ; row++) {
            for (int col = 0; col < m[0].length; col++) {
                if(m[row][col] == 0 ){
                    continue;
                }
                if(isSubmatrix(m, row, col)){

                }
            }
        }
    }

    private static boolean isSubmatrix(int[][] m, int row, int col) {
        return m[row][col + 1] == 1 && m[row + 1][col] == 1 &&
                m[row + 1][col + 1] == 1;
    }
}
