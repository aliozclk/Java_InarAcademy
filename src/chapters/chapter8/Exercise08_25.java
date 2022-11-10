package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        readThem(matrix, input );

        if(isMarkovMatrix(matrix)){
            System.out.println("It is a Markov matrix.");
        }else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

    public static boolean isMarkovMatrix(double[][] m){
        int count = 0 ;
        for (int col = 0; col < m[0].length; col++) {
            double sum = 0 ;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if(sum == 1 ){
                count++;
            }
        }

        return count == m.length;
    }
}
