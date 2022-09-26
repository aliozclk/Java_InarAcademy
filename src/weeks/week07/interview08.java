package weeks.week07;

import java.util.Scanner;

public class interview08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = input.nextLine();
        System.out.println("Enter second string : ");
        String str2 = input.nextLine();

        String removedString = stringRemover(str1, str2);

        System.out.println(removedString);
    }

    public static String stringRemover(String s1, String s2) {
        String str = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) < 0) {
                str += s1.charAt(i);
            }
        }
        return str;
    }
}
