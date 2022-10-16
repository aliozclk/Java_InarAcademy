package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter ten integers : ");// 3 - 8 - 9 - 15 - 45 - 89 ...

        readThem(numbers,input);
        printCombinations(numbers);//
    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] =  input.nextInt();

            }

    }

    public static void printCombinations(int[] array){
        int combo = 1;
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                System.out.println(combo + ". combination : [" + array[i] + "," + array[j] + "]");
                combo++;
            }
        }
    }
}
