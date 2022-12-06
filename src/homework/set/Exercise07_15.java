package homework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        int[] eliminated = new int[10];
        eliminated = eliminateDuplicates(numbers);
        for (int i = 0; i < eliminated.length; i++) {
            System.out.print(eliminated[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list) {

        Set<Integer> distinct = new HashSet<>();

        for (int i = 0; i < list.length; i++) {
            distinct.add(list[i]);
        }
        int[] newArray = new int[distinct.size()];
        int count = 0;
        for (int num :distinct) {
            newArray[count] = num;
            count++;
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

}
