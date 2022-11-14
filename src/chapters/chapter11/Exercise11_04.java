package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (0 for the end) : ");
        Integer integer = Integer.valueOf(input.nextInt());
        do {
          list.add(integer);
            integer = Integer.valueOf(input.nextInt());
        }while (!integer.equals(Integer.valueOf(0)));
        System.out.println("Max number is : " + max(list));

    }

    public static Integer max(ArrayList<Integer> list){
        if(list.size() == 0 || list == null){
            return null;
        }
        Integer max = list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
}
