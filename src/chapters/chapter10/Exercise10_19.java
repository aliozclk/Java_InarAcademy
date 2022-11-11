package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {
        System.out.println("p\t\t2^p - 1");

        BigInteger p = new BigInteger("2");
        while (p.compareTo(new BigInteger("100")) <= 0) {
            if (isPrime(p)) {
                System.out.printf("%-3d", p);
                System.out.println("       " + mersennePrime(p));
            }
            p = p.add(new BigInteger("1"));
        }
    }

    public static BigInteger mersennePrime(BigInteger n) {
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");
        BigInteger i = new BigInteger("1");
        while ( i.compareTo(n) < 0 ) {
            x = x.multiply(two);
            i = i.add(new BigInteger("1"));
        }
        return x.subtract(new BigInteger("1"));
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
