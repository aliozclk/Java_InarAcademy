package weeks.week_17;

import java.util.*;

/**
 * 1- Works with Key-Value principle
 */

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 48);
        map.put(5, 447);
        map.put(2, 76);

        print(map);

    }

    private static void print(Map map) {
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        Set<Integer> set = map.keySet();

        for (Integer key : set) {
            System.out.println(map.get(key));
        }
    }

    public static void wordCounter(String resume, Set<String> jd) {
        Map<String, Integer> map = new HashMap<>();
        String[] resumeArr = resume.split("//s");
        for (String word : resumeArr) {
            if (jd.contains(word)) {
                if (map.containsKey(word)) {
                    int number = map.get(word);
                    map.put(word, number + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }


        System.out.println(Arrays.toString(map.keySet().toArray()));
        System.out.println(Arrays.toString(map.values().toArray()));
    }
}
