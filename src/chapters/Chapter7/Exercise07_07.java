package chapters.Chapter7;

import java.util.Arrays;

public class Exercise07_07 {
    public static void main(String[] args) {

        int[] count = new int[10];

        for (int i = 0; i < 100; i++) {

            int number = generateRandomNum();
            count[number]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s : " + count[i] + " times");
        }
    }

    public static int generateRandomNum(){
        int num = (int) (Math.random()*10);
        return num;
    }
}
