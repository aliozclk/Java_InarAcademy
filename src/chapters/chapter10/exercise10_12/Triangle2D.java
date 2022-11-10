package chapters.chapter10.exercise10_12;

import chapters.chapter10.exercise10_04.MyPoint;

public class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public Triangle2D(){
        this(new MyPoint(0,0),new MyPoint(1,1), new MyPoint(2,5));
    }
    public Triangle2D(MyPoint p1, MyPoint p2 , MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea(){
        double side1 =  p1.distance(p2);
        double side2 =  p2.distance(p3);
        double side3 =  p3.distance(p1);

        double s = (side1 + side2 + side3)/ 2 ;
        return Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
    }

    public double getPerimeter(){
        return p1.distance(p2) +
        p2.distance(p3) +
        p3.distance(p1);
    }

    public boolean contains(MyPoint myPoint){
        return numberOfIntersectingPoint(myPoint) == 3 ;
    }

    public int numberOfIntersectingPoint(MyPoint myPoint){
        int count = 0 ;
        if(isPointsIntersected(myPoint)){
            count++;
        }
        return count;
    }

    public boolean isPointsIntersected(MyPoint myPoint){
        return 0<1;
    }
}
