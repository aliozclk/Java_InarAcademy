package chapters.chapter13.exercise13_18;

import java.math.BigInteger;

public class Test13_18 {
    public static void main(String[] args) {
        Rational rational = new Rational(BigInteger.ONE,BigInteger.valueOf(2));

        for (int i =2 ; i < 100; i++) {
            Rational secondRational = new Rational(BigInteger.valueOf(i),BigInteger.valueOf(i+1));
            rational = rational.add(secondRational);
        }

        System.out.println(rational.toString());
    }
}
