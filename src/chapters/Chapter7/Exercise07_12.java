package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " " );
        }
        System.out.println();
    }
    public static void readThem(int[] numbers, Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();

        }
    }
    public static void reverse(int[] list) {

        for (int i = list.length-1 , j = 0 ; i >= list.length/2 ; i-- , j++) {
            int temp = list[i];
            list[i]= list[j];
            list[j]= temp;
        }


    }


}
