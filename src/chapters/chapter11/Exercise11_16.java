package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("What is 5 + 9?");
        int answer = 0;
        do {
            answer = input.nextInt();
            if(list.contains(answer)){
                System.out.println("You already entered " + answer);
            }
            if(answer != 14){
                System.out.println("Wrong answer. Try again. What is 5 + 9?");
            }

            list.add(answer);
        }while (answer != 14);
        System.out.println("You got it!");
    }
}
