package chapters.chapter9;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        long n = 10_000;
        Date date = new Date(n);

        for (int i = 0; i < 8; i++) {

            System.out.println(date.toString());
            n *= 10 ;
            date.setTime(n);

        }

    }
}
