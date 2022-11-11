package chapters.chapter10;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);

        int count = 0 ;
        while (count < 10){
            number = number.add(new BigInteger("1"));
            BigInteger remFor5 = number.remainder(new BigInteger("5"));
            BigInteger remFor6 = number.remainder(new BigInteger("6"));
            if(remFor5 ==  BigInteger.ZERO ||
                    remFor6 == BigInteger.ZERO){
                System.out.println((count + 1) + " : " + number  );
                count++;

            }
        }

    }
}
