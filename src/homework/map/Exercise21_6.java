package homework.map;

import java.util.*;

public class Exercise21_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        fillMapWithInput(input, map);

        theMostOccurences(map);


    }

    private static void theMostOccurences(Map<Integer, Integer> map) {
        Set<Integer> set =  map.keySet();

        int maxValue = 0;
        int maxKey = 0;
        for (int key: set ) {
            if(map.get(key)> maxValue ){
                maxValue = map.get(key);
                maxKey = key;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int key: set ) {
            if(map.get(key) == maxValue ){
                maxValue = map.get(key);
                list.add(key);
            }
        }
        System.out.print("The most occurences : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i));
        }
    }

    private static void fillMapWithInput(Scanner input, Map<Integer, Integer> map) {
        System.out.println("Enter numbers : ");
        int number = input.nextInt();
        do {
            if (map.containsKey(number)) {
                int occurence = map.get(number);
                map.put(number, occurence + 1);
            } else {
                map.put(number, 1);
            }
            number = input.nextInt();
        }while (number != 0);
    }
}
