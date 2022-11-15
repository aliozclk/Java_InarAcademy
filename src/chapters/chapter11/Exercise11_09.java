package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        System.out.println("Enter the array size n: ");
        int size = input.nextInt();;
        int[][] arr = new int[size][size];

        randomArray(arr);
        System.out.println("The random array is");
        printArray(arr);
        getSumInRows(arr,row);
        getSumInCols(arr,col);
        int maxRow = java.util.Collections.max(row);
        int maxCol = java.util.Collections.max(col);
        System.out.print("The largest row index:" );
        for (int i = 0; i < row.size(); i++) {
            System.out.print(row.get(i) + ",");
        }
        System.out.println();
        System.out.print("The largest column index: ");
        for (int i = 0; i < col.size(); i++) {
            System.out.print(col.get(i)+ ", ");
        }



    }

    public static void randomArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =(int) (Math.random()*2);
            }
        }
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void getSumInRows(int[][] arr , ArrayList<Integer> row){
        int[] sumOfRows = new int[arr.length];
        int max = -1;
        for (int r = 0; r < arr.length; r++) {
            int sum = 0 ;
            for (int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
            }
            sumOfRows[r] = sum;
            if(max < sum){
                max = sum;
            }
        }
        getMaxInArray(sumOfRows,row,max);
    }

    public static void getSumInCols(int[][] arr, ArrayList<Integer> col){
        int max = -1;
        int[] sumOfCols = new int[arr.length];
        for (int c = 0; c < arr.length; c++) {
            int sum = 0;
            for (int r = 0; r < arr.length; r++) {
                sum += arr[r][c];
            }
            sumOfCols[c] = sum;
            if(max < sum){
                max = sum;
            }
        }
        getMaxInArray(sumOfCols,col,max);
    }

    public static void getMaxInArray(int[] arr, ArrayList<Integer> list,int max){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                list.add(i);
            }
        }
    }
}
