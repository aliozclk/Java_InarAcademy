package chapters.Chapter10.Exercise10_05;

import java.util.Scanner;

public class Exercise10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt and read number
        System.out.println("enter a positive integer");
        int num = input.nextInt();

        System.out.println("smallest factors in increasing order:");
        StackOfIntegers factors = findSmallestFactors(num);
        System.out.println();


        //display them in reverse order
        System.out.println("display them in reverse order:");
        displayReverseOrder(factors);
    }

    public static StackOfIntegers findSmallestFactors(int num) {
        StackOfIntegers factors = new StackOfIntegers();
        for (int i = 2; i <= num; i++) {
            if (!isPrime(i)) {
                continue;
            }
            while (num % i == 0) {
                num /= i;
                System.out.print(i + ", ");
                factors.push(i);
            }
        }


        return factors;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayReverseOrder(StackOfIntegers factors){
        int size = factors.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(factors.pop() + ",");

        }
    }


}
