package chapters.chapter10;

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {

        for (int i = 100 ; i < 1_000 ; i += 100) {
            BigDecimal result = factoriel(new BigDecimal(i));
            System.out.println(i + " : " + result);
        }

    }

    public static BigDecimal factoriel(BigDecimal bd){

        BigDecimal one = new BigDecimal("1");
        BigDecimal e = new BigDecimal("0.0");
        for (BigDecimal i = one; i.compareTo(bd) <= 0; i = i.add(one)) {
            BigDecimal factorel = i;
            for (BigDecimal j = i.subtract(one);
                 j.compareTo(one) >= 1;
                 j = j.subtract(one)) {
                factorel = factorel.multiply(j);
            }
            // Use 25 digits of precision
            e = e.add(one.divide(factorel, 25, BigDecimal.ROUND_UP));
        }
        return e;
    }
}
