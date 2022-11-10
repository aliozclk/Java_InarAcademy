package chapters.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 : ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        readThem(list1,input);

        System.out.println("Enter list2 :");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        readThem(list2,input);

        int[] mergedList = new int[size1+size2];
        mergedList = merge(list1 , list2);

        printArray(mergedList);

    }
    public static int[] merge(int[] list1, int[] list2){
        int[] array = new int[list1.length + list2.length];

        int i = 0;
        for (int j = 0; j < list1.length; j++) {
            array[i] = list1[j];
            i++;
        }
        for (int j = 0; j < list2.length; j++) {
            array[i] = list2[j];
            i++;
        }

        Arrays.parallelSort(array);
        return array;
    }
    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] =  input.nextInt();

        }

    }
    public static void printArray(int[]array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
