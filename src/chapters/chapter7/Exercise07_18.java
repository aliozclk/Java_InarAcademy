package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter double ten numbers : ");
        readThem(numbers,input);
        bubbleSort(numbers);
        printArray(numbers);


    }

    public static void readThem(double[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }

    public static void bubbleSort(double[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if (array[j] > array[j+1] ){
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
    }
    public static void printArray( double[]array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
