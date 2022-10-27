package chapters.Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        System.out.println("Enter list 1: ");
        readThem(list1, input);

        int[][] list2 = new int[3][3];
        System.out.println("Enter list 2: ");
        readThem(list2, input);

        if(equals(list1,list2)){
            System.out.println("The two arrays are  identical");
        }else {
            System.out.println("The two arrays are not  identical");
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
        int[][] list1 = new int[3][3];
        System.arraycopy(m1 , 0 , list1 , 0 , m1.length) ;

        int[][] list2 = new int[3][3];
        System.arraycopy(m2 , 0 , list2 , 0 , m2.length) ;

        for (int i = 0; i < list1.length; i++) {
            Arrays.parallelSort(list1[i]);
            Arrays.parallelSort(list2[i]);
        }

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if(list1[row][col] != list2[row][col]){
                    return false;
                }
            }
        }

        return true;
    }

}
