package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter ten integers : ");
        readThem(numbers,input);
        int numberOfDistincts = distinctCounter(numbers);
        System.out.println("The number of distinct number is " + numberOfDistincts);
        System.out.print("The distinct numbers are: " );
        printArray(numbers);


    }

    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            int num = input.nextInt();
            if(isDistinct(numbers,num)){
                numbers[i] = num ;
            }
        }
    }

    public static boolean isDistinct(int[] numbers , int num ){
        for (int i = 0; i < numbers.length ; i++) {
            if(num == numbers[i]){
                return false;
            }

        }
        return true;
    }

    public static void printArray(int[] counter){
        for (int i = 0; i < counter.length ; i++) {
            if( counter[i] != 0 ){
                System.out.print(counter[i] + " ");
            }
        }
        System.out.println();
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


}
