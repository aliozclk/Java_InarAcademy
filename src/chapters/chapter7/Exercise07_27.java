package chapters.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        readThem(list1,input);

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        readThem(list2,input);

        System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ")
                +" identical");

    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        Arrays.parallelSort(list1);
        Arrays.parallelSort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();
        }
    }
}
