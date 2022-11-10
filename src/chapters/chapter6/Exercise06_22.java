package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        long num = input.nextLong();

        System.out.println("The square root of the number is " + sqrt(num));

    }

    public static double sqrt(long n){
        double lastGuess = 1;
        double nextGuess = 0;
        while(!(Math.abs(lastGuess-nextGuess) <= 0.0001) ){
            nextGuess = (lastGuess + (double) n / lastGuess) / 2.0 ;
            double temp = lastGuess;
            lastGuess = nextGuess;
            nextGuess = temp;
        }

        return nextGuess;
    }
}
