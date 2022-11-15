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
        sort(list);
        System.out.println(list);
    }
    public static void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            for (int j = i +1 ; j < list.size(); j++) {
                if (list.get(j) < min){
                    min = list.get(j);
                    list.remove(j);
                    list.add(j,list.get(i));
                    list.remove(i);
                    list.add(i,min);
                }
            }
        }
    }


}
