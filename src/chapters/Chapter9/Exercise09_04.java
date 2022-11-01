package chapters.Chapter9;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            System.out.println( i + ". Random Num : " + random.nextInt(100) );
        }
    }
}
