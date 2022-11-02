package chapters.Chapter9.Exercise09_10;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a,b,c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.nextLine();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if(equation.getDiscriminant() > 0){
            System.out.println("Root 1 : " + equation.getRoot1());
            System.out.println("Root2 : " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Root 1 : " + equation.getRoot1());
        }else {
            System.out.println("The equation has no roots.");
        }
    }
}
