package homework.set;

import java.util.*;

public class Exercise11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter five integers for list2:");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        Set<Integer> united = union(list1,list2);
        System.out.print("The combined list is ");
        for (int num :
                united) {
            System.out.print(num + ", ");

        }


    }

    public static Set<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){
        Set<Integer> unitedLists = new HashSet<>();

        for (int i = 0; i < list1.size(); i++) {
            unitedLists.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            unitedLists.add(list2.get(i));
        }

        return unitedLists;
    }
}
