package chapters.chapter6;

public class Exercise06_10 {
    public static void main(String[] args) {
        int count = 0 ;
        for (int i = 2 ; i < 10_000 ; i++ ){
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println("number of primes less than 10000 :   " + count);
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
}
