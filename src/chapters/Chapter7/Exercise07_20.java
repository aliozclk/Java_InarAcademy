package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter double ten numbers : ");
        readThem(numbers,input);

        editedSelectionSort(numbers);
        printArray(numbers);
    }

    public static void readThem(double[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }

    public static void editedSelectionSort(double[] list){
        for (int i = list.length-1 ; i > 0; i--) {

            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i -1; j >= 0 ; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }


            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
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
