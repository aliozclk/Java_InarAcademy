package chapters.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter size of the list: ");
        int size = input.nextInt();
        input.nextLine();
        System.out.println("Enter list : ");
        int[] numbers = new int[size];
        readThem(numbers,input);
        System.out.print("The list is ");
        if(isSorted(numbers)){
            System.out.println("already sorted.");
        }else {
            System.out.println("not sorted.");
        }

    }

    public static boolean isSorted(int[] list){
        int[] sortedList = new int[list.length];
        //copyArray(list,sortedList);
        sortedList = Arrays.copyOf(list,list.length);
        Arrays.parallelSort(sortedList);

        return Arrays.equals(list,sortedList);
    }


    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextInt();

            }
    }
    public static void copyArray(int[] origin, int[] imitation){
        for (int i = 0; i < origin.length; i++) {
            imitation[i] = origin[i];
        }
    }
}
