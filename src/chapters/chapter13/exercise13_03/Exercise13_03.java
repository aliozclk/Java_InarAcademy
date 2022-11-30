package chapters.chapter13.exercise13_03;

import java.util.ArrayList;

public class Exercise13_03 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(3);


        numbers.add(9.9);
        numbers.add(11.1113);

        numbers.add(7.7);

        numbers.add(5);

        System.out.println(numbers.toString());
        sort(numbers);
        System.out.println(numbers.toString());

    }
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;
            for (int j = i +1; j < list.size(); j++) {
                if(min.doubleValue() > list.get(j).doubleValue()){
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if(minIndex != i){
                list.set(minIndex, list.get(i));
                list.set(i,min);
            }
        }

    }
}
