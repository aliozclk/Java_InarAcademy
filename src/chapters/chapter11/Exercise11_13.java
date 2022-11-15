package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println();
        removeDuplicate(list);
        System.out.println("The distinct integers are " + list.toString());
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}
