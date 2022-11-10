package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        System.out.println("The minimum number is: " + min(numbers));


    }

    public static double min(double[] array){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;

    }

    public static void readThem(double[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }
}
