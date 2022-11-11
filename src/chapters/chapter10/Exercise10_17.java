package chapters.chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);

        int count = 0 ;
        long rootNum = (long) Math.sqrt(bigInteger.doubleValue());
        BigInteger squareRoot = BigInteger.valueOf(rootNum);
        while (count < 10){
            squareRoot = squareRoot.add(BigInteger.ONE);
            BigInteger n2 = squareRoot.pow(2);

            if (n2.compareTo(bigInteger) > 0) {
                System.out.println((count + 1) + " : " + n2);
                count++;
            }
        }
    }

}
