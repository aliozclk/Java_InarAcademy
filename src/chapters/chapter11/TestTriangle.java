package chapters.chapter11;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        input.nextLine();
        System.out.println("Enter color of the triangle :");
        String color = input.nextLine();
        System.out.println("Is the triangle filled ? y / n :");
        char ch = input.next().charAt(0);
        boolean filled = (ch == 'y') ? true : false ;

        Triangle tr = new Triangle(color,filled,side1,side2,side3);
        String info = "Area: "+Double.toString(tr.getArea())
                + "\nPerimeter : " + Double.toString(tr.getPerimeter());
        info += "\nColor:  " + tr.getColor() + "\n" + (tr.isFilled() ? "filled " : "not filled ");
        System.out.println(info);
    }
}
