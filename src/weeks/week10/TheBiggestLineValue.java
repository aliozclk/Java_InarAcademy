package weeks.week10;

import java.util.Scanner;

public class TheBiggestLineValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows and col of matrix : ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] array = new int[row][col];
        fill2DArrWithRandomValues(array , 0 , 10 );
        printArray(array);
        int biggest = findTheBiggestRow(array);
        System.out.println("Biggest Row : " + biggest );

    }
    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int)(Math.random() * (limit - start)) + (start) ;
            }
        }
    }
    public static int findTheBiggestRow(int[][] arr){
        int biggestRowValue = -1;
        int biggestRow = -1;
        for (int row = 0; row < arr.length ; row++) {
            int sum = 0 ;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if (sum > biggestRowValue){
                biggestRowValue = sum;
                biggestRow = row;
            }
        }

        return biggestRow;
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
