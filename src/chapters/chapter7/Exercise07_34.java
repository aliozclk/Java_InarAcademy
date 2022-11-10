package chapters.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.nextLine();

        str = sort(str);
        System.out.println("Sorted string : " + str);
    }
    public static String sort(String s){
        char[] sortedStr = new char[s.length()];
        for (int i = 0; i < sortedStr.length; i++) {
            sortedStr[i] = s.charAt(i);
        }

        for (int i = 0; i < sortedStr.length - 1; i++) {
            char min =sortedStr[i];
            int minIndex = i;
            for (int j = i+1; j < sortedStr.length; j++) {
                 if(sortedStr[j] < min ){
                     min = sortedStr[j];
                     minIndex = j ;
                 }
            }
            if(sortedStr[i] != min){
                sortedStr[minIndex] = sortedStr[i];
                sortedStr[i] = min;

            }
        }

        return Arrays.toString(sortedStr);
    }
}
