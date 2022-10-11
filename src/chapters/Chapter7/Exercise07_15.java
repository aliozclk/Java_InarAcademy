package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        int[] eliminated = new int[10];
        eliminated = eliminateDuplicates(numbers);
        int numberOfDistincts = distinctCounter(eliminated);
        for (int i = 0; i < numberOfDistincts; i++) {
            System.out.print(eliminated[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] newArray = new int[list.length];
        int count = 0 ;
        for (int i = 0; i < list.length; i++) {
            if(isDistinct(newArray , list[i])){
                newArray[count] = list[i];
                count++;
            }
        }
        return newArray;
    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= (int) input.nextDouble();

        }
    }
    public static int distinctCounter(int[] numbers){
        int count = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0 ){
                count++;
            }
        }
        return count;
    }
    public static boolean isDistinct(int[] numbers , int num ) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return false;
            }

        }
        return true;
    }
}
