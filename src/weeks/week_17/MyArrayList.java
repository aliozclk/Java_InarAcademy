package weeks.week_17;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(1);
        list.add(3);

        System.out.println("Min index : " + indexOfSmallestElement(list));

    }

    private static Integer min(List list){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i< list.size() ; i++){

        }
        return min;
    }

    public static int indexOfSmallestElement(List list){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) < min){
                min = ((int) list.get(i));
                minIndex = i;
            }
        }
        return minIndex;
    }
}
