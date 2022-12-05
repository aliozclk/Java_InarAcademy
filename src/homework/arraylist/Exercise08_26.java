package homework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //double[][] matrix = new double[3][3];
        ArrayList<Double>[] matrix = new ArrayList[3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new ArrayList<>();
        }

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        readThem(matrix, input);

        sortRows(matrix);

        printArray(matrix);

    }

    public static void readThem(ArrayList<Double>[] numbers,Scanner input) {
        for (int row = 0; row < 3 ; row++) {
            for (int col = 0; col < 3 ; col++) {
                numbers[row].add(input.nextDouble());
            }
        }
    }

    public static void sortRows(ArrayList[] m){
        for (int rows = 0; rows < m.length; rows++) {
            for (int i = 0; i < m[rows].size(); i++) {
                int minIndex = -1;
                double min = Double.MAX_VALUE;
                for (int j = i; j < m.length ; j++) {

                    if((double)m[rows].get(j) < min){
                        min =(double) m[rows].get(j) ;
                        minIndex = j ;
                    }
                }
                double temp = 0;
                temp = (double) m[rows].get(i);
                m[rows].set(i,m[rows].get(minIndex));
                m[rows].set(minIndex,temp);
            }
        }
    }

    public static void printArray(ArrayList[] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].size(); col++) {
                System.out.print(chars[row].get(col)+ " | ");
            }
            System.out.println();
        }
    }

}