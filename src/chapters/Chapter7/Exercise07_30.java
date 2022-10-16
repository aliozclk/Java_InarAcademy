package chapters.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the values: ");
        readThem(numbers,input);

        if (isConsecutiveFour(numbers)){
            System.out.println("The list has consecutive fours");
        }else {
            System.out.println("The list has no consecutive fours");
        }


    }
    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] =  input.nextInt();

        }

    }

    public static boolean isConsecutiveFour(int[] values){
        for (int i = 0; i < values.length - 4; i++) {
            if(values[i] == values[i+1] && values[i+1] == values[i+2] &&
                    values[i+2] == values[i+3] ){
                return true;
            }
        }
        return false;
    }
}
