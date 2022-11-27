package chapters.chapter10;

import chapters.chapter10.exercise10_05.Exercise10_05;
import chapters.chapter10.exercise10_05.StackOfIntegers;

public class Exercise10_06 {
    public static void main(String[] args) {
        StackOfIntegers decreasingOrder = new StackOfIntegers();
        StackOfIntegers increasingOrder = new StackOfIntegers();

        for (int i = 2; i < 120 ; i++) {
            if(Exercise10_05.isPrime(i)){
                decreasingOrder.push(i);
            }
        }

        System.out.println("Decreasing order :");
        displayDecreasingOrder(decreasingOrder,increasingOrder);
        System.out.println();
        System.out.println("Increasing Order : ");
        displayIncreasingOrder(increasingOrder);

    }
    public static void displayDecreasingOrder(StackOfIntegers factors,StackOfIntegers rev){
        int size = factors.getSize();
        for (int i = 0; i < size; i++) {
            reverseOrder(factors.peek(), rev);
            System.out.print(factors.pop() + ", ");
            if((i + 1 ) % 5 == 0){
                System.out.println();
            }


        }
    }
    public static void displayIncreasingOrder(StackOfIntegers factors){
        int size = factors.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(factors.pop() + ", ");
            if((i + 1 ) % 5 == 0){
                System.out.println();
            }
        }
    }

    public static void reverseOrder(int num,StackOfIntegers reverse){
        reverse.push(num);
    }

}
