package weeks.week_17;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        addRandomValuesToTheList(list, 15);
        print(list);
        printUniqueValuesOnly(list);
    }

    public static void addRandomValuesToTheList(List<Integer> list, int i) {
        for (int a = 0; a < i; a++) {
            list.add( (int) (Math.random() * 10));
        }
    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
    }

    public static void printUniqueValuesOnly(List<Integer> list) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            set.add((int) list.get(i));
        }
        System.out.println(Arrays.toString(set.toArray()));

    }
}


