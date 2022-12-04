package homework.arraylist;

import java.util.ArrayList;

public class Exercise07_07 {
    public static void main(String[] args) {

        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            count.add(0);
        }
        // int[] count = new int[10];

        for (int i = 0; i < 100; i++) {

            int number = generateRandomNum();
            count.set(number, count.get(number) + 1 );
        }

        for (int i = 0; i < count.size(); i++) {
            System.out.println(i + "s : " + count.get(i) + " times");
        }
    }

    public static int generateRandomNum(){
        int num = (int) (Math.random()*10);
        return num;
    }
}
