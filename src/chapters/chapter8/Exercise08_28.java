package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        System.out.println("Enter list 1: ");
        readThem(list1, input);

        int[][] list2 = new int[3][3];
        System.out.println("Enter list 2: ");
        readThem(list2, input);

        if(equals(list1,list2)){
            System.out.println("The two arrays are strictly identical");
        }else {
            System.out.println("The two arrays are not strictly identical");
        }


    }

    public static void readThem(int[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextInt();
            }
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if(m1[row][col] != m2[row][col]){
                    return false;
                }
            }
        }

        return true;
    }

}
