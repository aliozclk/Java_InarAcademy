package homework.set;

import java.util.HashSet;
import java.util.Set;

public class Exercise07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int number = 2; // A number to be tested for primeness
        Set<Integer> primeNumbers = new HashSet<>();

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (primeNumbers.size() < NUMBER_OF_PRIMES) {
            if (isPrime(number,primeNumbers)){
                primeNumbers.add(number);
            }
            number++;
        }
        int count = 0;
        for (int prime: primeNumbers  ) {
            System.out.printf("%4d," ,prime);
            count++;
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
    private static boolean isPrime(int number,Set<Integer> primeNumbers){
        for (int prime : primeNumbers) {
            if(prime <= Math.sqrt(number) && number % prime == 0){
                return false;
            }
        }
        return true;
    }
}
