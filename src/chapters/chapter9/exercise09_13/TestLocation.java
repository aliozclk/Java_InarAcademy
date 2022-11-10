package chapters.chapter9.exercise09_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = readThem(input);

        Location x = Location.locateLargest(array);

        System.out.println("Index :[" + x.row + "][" + x.column + "]" );
        System.out.println("Max Value:" + x.maxValue);


    }
    public static double[][] readThem(Scanner input) {
        System.out.println("Enter row :");
        int r = input.nextInt();
        System.out.println("Enter col :");
        int c = input.nextInt();

        double[][] numbers = new double[r][c];

        for (int row = 0; row < numbers.length ; row++) {
            for (int col = 0; col < numbers[row].length ; col++) {
                numbers[row][col] = input.nextDouble();
            }
        }

        return numbers;
    }
}
