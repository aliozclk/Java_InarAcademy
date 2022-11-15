package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers : ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        java.util.Collections.sort(list);
        System.out.println(list);
    }


}
