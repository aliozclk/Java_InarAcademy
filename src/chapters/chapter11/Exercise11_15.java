package chapters.chapter11;

import chapters.chapter10.exercise10_04.MyPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<MyPoint> list = new ArrayList<>();
        System.out.println("Enter the number of the points:");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < numberOfPoints; i++) {
            list.add(new MyPoint(input.nextDouble(),input.nextDouble()));
        }

        System.out.println("The total area is" + getArea(list));
    }

    public static double getArea(ArrayList<MyPoint> list){
        int area1 = 0;
        int area2 = 0 ;
        for (int i = 0; i < list.size(); i++) {
            int nextPoint = (i + 1) % list.size();
            MyPoint point1 = list.get(i);
            MyPoint point2 = list.get(nextPoint);
            area1 += (point1.getX() * point2.getY());
            area2 += (point1.getY() * point2.getX());
        }
        return 0.5 * Math.abs(area1 - area2);
    }
}
