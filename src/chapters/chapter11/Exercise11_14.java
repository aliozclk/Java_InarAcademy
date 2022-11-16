package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers for list1:");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter five integers for list2:");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.println(union(list1,list2).toString());

    }
    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> unitedList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            unitedList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            unitedList.add(list2.get(i));
        }

        return unitedList;
    }
}
