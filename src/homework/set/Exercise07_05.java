package homework.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println("The number of distinct number is " + set.size());

        System.out.print("The distinct numbers are: ");
        String distinctNumbers = Arrays.toString(set.toArray());
        for (int i = 1; i < distinctNumbers.length() - 1; i++) {
            System.out.print(distinctNumbers.charAt(i) );
        }
    }
}
