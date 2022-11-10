package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double value: ");

        readThem(numbers,input);
        double avg = average(numbers);
        System.out.println("The average is " + avg);

    }
    public static void readThem(double[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }
    public static double average(double[] array){
        double sum = 0 ;
        for (int i = 0; i < array.length ; i++) {

            sum += array[i];
        }

        return sum / array.length ;
    }

    public static int average(int[] array){
        int sum = 0 ;
        for (int i = 0; i < array.length ; i++) {

            sum += array[i];
        }

        return sum / array.length ;
    }

}
