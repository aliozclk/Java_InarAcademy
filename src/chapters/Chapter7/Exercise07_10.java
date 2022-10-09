package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        System.out.println("The minimum number's index is: " + indexOfSmallestElement(numbers));

    }
    public static int indexOfSmallestElement(double[] array){
        double min = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
                minIndex = i ;
            }
        }

        return minIndex;

    }
    public static void readThem(double[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }
}
