package chapters.chapter12;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];
        fillThisArrayWıthRandomValues(arr);

        System.out.println("Enter an index");
        try {
            int index = input.nextInt();

            System.out.println(arr[index]);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }

    public static void fillThisArrayWıthRandomValues(int[] num){
        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(100);
        }
    }
}
