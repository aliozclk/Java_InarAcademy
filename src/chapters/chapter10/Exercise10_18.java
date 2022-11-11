package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "");

        int count = 0; // Counts number of primes

        System.out.println();
        while (count < 5) {
            bigInteger = bigInteger.add(new BigInteger("1"));
            if (isPrime(bigInteger)){
                count++;
                System.out.println(bigInteger);
            }
        }
    }

    public static boolean isPrime(BigInteger number) {
        BigInteger n = new BigInteger("2");
        while (!n.equals(number)){
            if (number.remainder(n) == BigInteger.ZERO) {
                return false;
            }
            n = n.add(BigInteger.ONE);
        }
        return true;
    }

}
