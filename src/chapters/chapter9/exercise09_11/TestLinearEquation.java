package chapters.chapter9.exercise09_11;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, and f : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        input.nextLine();

        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
        if(equation.isSolvable()){
            System.out.println("X : " + equation.getX());
            System.out.println("Y : " + equation.getY());
        }else {
            System.out.println("The equation has no solution.");
        }
    }
}
