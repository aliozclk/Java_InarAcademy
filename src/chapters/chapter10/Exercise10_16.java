package chapters.chapter10;

import java.math.BigDecimal;

public class Exercise10_16 {
    public static void main(String[] args) {
        String value = "1";
        for (int i = 1; i < 50; i++) {
            value += "0";
        }
        BigDecimal bigDecimal = new BigDecimal(value);
        System.out.println(bigDecimal.toString());

        int count = 0 ;
        while (count < 10 ){
            BigDecimal remFor2 = bigDecimal.remainder(BigDecimal.valueOf(2L));
            BigDecimal remFor3 = bigDecimal.remainder(BigDecimal.valueOf(3L));
            if(remFor3.intValue() == 0 || remFor2.intValue() == 0){
                System.out.println((count + 1 ) + ": " + bigDecimal.toString());
                count++;
            }

            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }

    }

}
