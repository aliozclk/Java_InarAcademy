package chapters.chapter10.exercise10_15;

import chapters.chapter10.exercise10_13.MyRectangle2D;

import java.util.Scanner;

public class Exercise10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];
        System.out.println("Enter five points: ");
        getThemFromUser(points,input);

        MyRectangle2D rectangle = getRectangle(points);
        System.out.println("The bounding rectangle's center (" +
               rectangle.getX() + ", " + rectangle.getY() + ")" +
                ", width " + rectangle.getWidth() +", height " + rectangle.getHeight());




    }
    public static void getThemFromUser(double[][] points,Scanner in){
        for (int i = 0; i < points.length; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
    }

    public static MyRectangle2D getRectangle(double[][] points){
        MyRectangle2D myRectangle2D = new MyRectangle2D();
        double leftSide = getMinPoint(points,0);
        double rightSide = getMaxPoint(points,0);
        double topSide = getMaxPoint(points,1);
        double bottomSide = getMinPoint(points,1);

        myRectangle2D.setHeight(topSide - bottomSide);
        myRectangle2D.setWidth(rightSide - leftSide);
        myRectangle2D.setX(leftSide + myRectangle2D.getWidth() / 2);
        myRectangle2D.setY(bottomSide + myRectangle2D.getHeight() / 2);

        return myRectangle2D;
    }

    public static double getMinPoint(double[][] points, int indexYOrX){
        double min = Double.MAX_VALUE ;
        for (int i = 0; i < points.length; i++) {
            if(points[i][indexYOrX] < min ){
                min = points[i][indexYOrX];
            }
        }
        return min;
    }

    public static double getMaxPoint(double[][] points, int indexYOrX) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][indexYOrX] > max) {
                max = points[i][indexYOrX];
            }
        }
        return max;
    }
}
