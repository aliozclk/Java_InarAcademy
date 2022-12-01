package chapters.chapter13.exercise13_05;

import chapters.chapter13.exercise13_09.GeometricObject;

public class Test13_05 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(8);

        GeometricObject triangle1 = new Triangle(3,4,5);
        GeometricObject triangle2 = new Triangle(5,12,13);

        System.out.println("Circle1 - Circle2 --Max : " + Circle.max(circle1,circle2).toString());
        System.out.println("Circle1 - Circle2 --Comp : " + circle1.compareTo(circle2));

        System.out.println("Triangle1 - Triangle2 -- Max : " + Triangle.max(triangle1,triangle2).toString());
        System.out.println("Triangle1 - Triangle2 -- Comp : " + triangle1.compareTo(triangle2));
    }
}
