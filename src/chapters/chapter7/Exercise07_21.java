package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop: ");
        int numOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int numOfSlots = input.nextInt();

        int[] slots = new int[numOfSlots];
        pathFinder(numOfBalls,numOfSlots,slots);
        printSlots(slots);


    }

    public static void pathFinder(int balls , int slot , int[] array ){

        for (int i = 0; i < balls; i++) {
            String leftOrRight = "";
            int count = 0 ;
            for (int j = 0; j < slot; j++) {
                int way = (int)(Math.random() * 2 );
                if(way == 0 ){
                    leftOrRight += 'L';
                }else {
                    leftOrRight += 'R';
                    count++;
                }
            }
            System.out.println(leftOrRight);
            array[count]++;

        }
    }

    public static void printSlots(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("____________________________________");
        int repeat = maxBallInSlot(arr);

        for (int i = 0; i < repeat; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] != 0 ){
                    System.out.print("0\t");
                    arr[j]--;
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int maxBallInSlot(int[] array){
        int max = 0 ;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max ){
                max = array[i];
            }

        }
        return max;
    }
}
