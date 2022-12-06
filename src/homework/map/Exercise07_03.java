package homework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter the integers between 1 and 100: ");
        int number = input.nextInt();
        while (number != 0) {
            if (map.containsKey(number)) {
                int occurence = map.get(number);
                map.put(number, occurence + 1);
            } else {
                map.put(number, 1);
            }
            number = input.nextInt();
        }

        printOccurences(map);


    }


    public static void printOccurences(Map map) {
        Set<Integer> set = map.keySet();
        for (int key : set) {
            System.out.println(key + " occurs " + map.get(key) + " times.");
        }
    }
}
