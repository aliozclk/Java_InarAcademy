package chapters.chapter13.exercise13_01;

import java.util.Scanner;

public class Test13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of Triangle : ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println("Triangle is Filled :");
        triangle.setFilled(input.nextBoolean());
        System.out.println("Color :");
        triangle.setColor(input.next());

        System.out.println(triangle.toString());


    }
}
