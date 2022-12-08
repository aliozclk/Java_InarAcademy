package homework.map;

import java.util.*;

public class SortMapWithKey {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < 10 ; i++) {
            fillMapWithRandomValuesAndKeys(map);
        }
        sortMap(map);
    }
    public static void fillMapWithRandomValuesAndKeys(Map map){
        int key = 0;
        do {
            key = new Random().nextInt(100);
        }while (map.containsKey(key));

        map.put(key ,new Random().nextInt(100));

    }
    public static void sortMap(Map map){
        Map<Integer, Integer> treeMap = new TreeMap<>(map);
        Map<Integer,Integer> sorted = new HashMap<>(treeMap);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
    }
}
