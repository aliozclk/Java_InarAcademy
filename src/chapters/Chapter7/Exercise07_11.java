package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));

    }

    public static void readThem(double[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();

        }
    }

    public static double deviation(double[] x){
        double deviation = 0 ;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean(x) , 2 ) ;
        }

        return deviation / (x.length - 1 );


    }

    public static double mean(double[] x){
        double sum = 0 ;
        for (int i = 0; i < x.length ; i++) {
            sum += x[i];
        }

        return sum / x.length;
    }
}
