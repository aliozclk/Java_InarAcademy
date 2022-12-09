package homework.map;

import java.util.*;

public class SortMapWithValue {
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
        Set<Integer> keys = map.keySet();
        Map<Integer,Integer> sortedMap = new HashMap<>();


        while(!keys.isEmpty()){
            int minKey = -1;
            int minValue = Integer.MAX_VALUE;
            for (int key : keys) {
                if((int) map.get(key) < minValue ){
                    minValue = (int) map.get(key);
                    minKey = key;
                }
            }
            System.out.println("Key : " + minKey + ", Value : " + minValue);
            keys.remove(minKey);
        }

    }
}
