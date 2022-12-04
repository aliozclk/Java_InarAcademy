package weeks.week_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        //1- Set can only store objects
        //2- Set can only store unique values
        //3- Set does not
        set.add(24);
        set.add(53);
        set.add(24);

        System.out.println(set.size());
        print(set);
    }

    private static void print(Set set){
        System.out.println(Arrays.toString(set.toArray()));
    }
}
