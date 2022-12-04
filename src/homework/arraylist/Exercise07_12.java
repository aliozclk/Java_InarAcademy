package homework.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] numbers = new int[10];
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter ten numbers: ");
        readThem(numbers,input);
        reverse(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " " );
        }
        System.out.println();
    }
    public static void readThem(ArrayList numbers, Scanner input) {
        for (int i = 0; i < 10 ; i++) {
            numbers.add(input.nextInt());

        }
    }
    public static void reverse(ArrayList list) {

        for (int i = list.size()-1 , j = 0 ; i >= list.size()/2 ; i-- , j++) {
            int temp = (int)list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }
}
