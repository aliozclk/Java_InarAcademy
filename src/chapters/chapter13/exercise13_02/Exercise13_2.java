package chapters.chapter13.exercise13_02;

import java.util.ArrayList;

public class Exercise13_2 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(7.7);
        numbers.add(9.9);
        numbers.add(11.1113);
        System.out.println(numbers.toString());
        shuffle(numbers);
        System.out.println(numbers.toString());

    }
    public static void shuffle(ArrayList<Number> list){
        java.util.Collections.shuffle(list);

    }
}
