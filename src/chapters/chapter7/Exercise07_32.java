package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 : ");
        int size1 = input.nextInt();
        int[] numbers = new int[size1];
        readThem(numbers,input);

        int pivotIndex = partition(numbers);
        System.out.print("After the partition , the list is ");
        printArray(numbers);


    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] =  input.nextInt();

        }

    }

    public static int partition(int[] list){
        int pivot = list[0];
        int pivotIndex = list.length / 2 ;
        list[0] = list[pivotIndex];
        list[pivotIndex] = pivot;
        for (int i = 0 ; i < pivotIndex ; i++) {
            for (int j = pivotIndex +1 ; j < list.length ; j++) {
                if(list[i] > pivot && list[j] < pivot ){
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return pivotIndex;
    }
    public static void printArray(int[]array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
