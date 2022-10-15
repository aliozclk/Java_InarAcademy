package weeks.week10;

import java.util.Scanner;

public class BiggestCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows and col of matrix : ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] array = new int[row][col];
        fill2DArrWithRandomValues(array , 0 , 10 );
        printArray(array);
        int biggest = findTheBiggestCol(array);
        System.out.println("Biggest Col: " + biggest );

    }
    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int)(Math.random() * (limit - start)) + (start) ;
            }
        }
    }

    public static int findTheBiggestCol(int[][] arr) {
        int biggestColValue = -1;
        int biggestCol = -1;
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row <arr.length ; row++) {
                sum += arr[row][col];
            }
            if (sum > biggestColValue) {
                biggestColValue = sum;
                biggestCol = col;
            }
        }
        return biggestCol;
    }

    public static void printArray(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]  + " | ");
            }
            System.out.println();
        }
    }
}
