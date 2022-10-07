package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integers between 1 and 100: ");
        int[] numbers = new int[100];
        readThem(numbers,input);
        int[] occurences = new int[100];
        countOccurences(numbers,occurences);
        printOccurences(occurences);


    }
    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();
            if(numbers[i] == 0 ){
                break;
            }
        }
    }

    public static void countOccurences(int[] list, int[] counter){
        for (int i = 1; i <counter.length ; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j] == i ){
                    counter[i]++;
                }
            }
        }
    }

    public static void printOccurences(int[] counter){
        for (int i = 0; i < counter.length ; i++) {
            if( counter[i] != 0 ){
                System.out.println(i + " occurs " + counter[i] + " times.");
            }
        }
    }
}
