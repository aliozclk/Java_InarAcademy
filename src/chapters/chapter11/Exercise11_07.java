package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (0 for the end) : ");
        Integer integer = Integer.valueOf(input.nextLine());
        do {
            list.add(integer);
            integer =  Integer.valueOf(input.nextLine());
        }while (!integer.equals(Integer.valueOf("0")));
        shuffle(list);
        System.out.println(list);

    }
    public static void shuffle(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());
            Integer temp = list.get(i);;
            list.set(i, list.get(index));
            list.set(index,temp);
        }
    }
}
