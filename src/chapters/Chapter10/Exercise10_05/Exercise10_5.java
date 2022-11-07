package chapters.Chapter10.Exercise10_05;

import java.util.Scanner;

public class Exercise10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt and read number
        System.out.println("enter a positive integer");
        int num = input.nextInt();
        StackOfIntegers reverse = new StackOfIntegers();
        StackOfIntegers factors = new StackOfIntegers();

        System.out.println("smallest factors in decreasing order:");
        findSmallestFactors(num,factors);
        decreasingOrder(factors, reverse);
        System.out.println();


        //display them in reverse order
        System.out.println("display them in reverse order:");
        displayReverseOrder(reverse);
    }

    public static void findSmallestFactors(int num, StackOfIntegers factors) {

        for (int i = 2; i <= num; i++) {
            if (!isPrime(i)) {
                continue;
            }
            while (num % i == 0) {
                num /= i;
                factors.push(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void decreasingOrder(StackOfIntegers factors,StackOfIntegers rev){
        int size = factors.getSize();
        for (int i = 0; i < size; i++) {
            reverseOrder(factors.peek(), rev);
            System.out.print(factors.pop() + ", ");


        }
    }

    public static void reverseOrder(int num,StackOfIntegers reverse){
        reverse.push(num);
    }

    public static void displayReverseOrder(StackOfIntegers factors){
        int size = factors.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(factors.pop() + ", ");
        }
    }


}
