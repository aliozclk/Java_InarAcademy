package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter ten integers : ");
        readThem(numbers,input);

        numbers = reverseArray(numbers);
        printArray(numbers);

    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();
        }
    }

    public static int[] reverseArray(int[] array){
        for (int i = array.length-1 , j = 0 ; i >= array.length/2 ; i-- , j++) {
            int temp = array[i];
            array[i]= array[j];
            array[j]= temp;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d" , array[i]);

        }
    }


}
