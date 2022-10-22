package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        /*
        (Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array.
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. Write a test program that prompts the user to enter a twodimensional
array and displays the location of the largest element in the array.
Here is a sample run:
    Enter the number of rows and columns of the array: 3 4
    Enter the array:
    23.5 35 2 10
    4.5 3 45 3.5
    35 44 5.5 9.6
    The location of the largest element is at (1, 2)
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] numbers = new double[rows][cols];
        System.out.println("Enter the array: ");
        readThem(numbers,input);

        int[] indexOfLargest = locateLargest(numbers);
        System.out.println("The location of the largest element is at ( " + indexOfLargest[0] +
                " , " + indexOfLargest[1] + " )");



    }
    public static int[] locateLargest(double[][] a){
        int[] location = new int[2];
        double max = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if(a[row][col] > max){
                    max = a[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        location[0] = maxRow;
        location[1] = maxCol;
        return location;

    }
    public static void readThem(double[][] numbers,Scanner input) {
        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }
    }

}
