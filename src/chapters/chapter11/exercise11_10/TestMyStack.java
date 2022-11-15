package chapters.chapter11.exercise11_10;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.println("Enter five strings: ") ;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ":");
            StringBuilder sb = new StringBuilder(input.nextLine());
            myStack.add(sb);
        }

        System.out.println("Reverse order :");
        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i + ":");
            StringBuilder stringBuilder = (StringBuilder) myStack.get(i-1);
            System.out.println(stringBuilder.reverse());
        }
    }
}
