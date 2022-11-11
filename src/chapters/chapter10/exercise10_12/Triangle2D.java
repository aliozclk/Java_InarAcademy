package chapters.chapter10.exercise10_12;

import chapters.chapter10.exercise10_04.MyPoint;
import chapters.chapter9.exercise09_01.Rectangle;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(){
        this(new MyPoint(0,0),new MyPoint(1,1), new MyPoint(2,5));
    }
    public Triangle2D(MyPoint p1, MyPoint p2 , MyPoint p3){
        this.setP1(p1);
        this.setP2(p2);
        this.setP3(p3);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea(){
        double side1 =  getP1().distance(getP2());
        double side2 =  getP2().distance(getP3());
        double side3 =  getP3().distance(getP1());

        double s = (side1 + side2 + side3)/ 2 ;
        return Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
    }

    public double getPerimeter(){
        return getP1().distance(getP2()) +
                getP2().distance(getP3()) +
                getP3().distance(getP1());
    }

    public boolean contains(MyPoint myPoint){

        return getArea() == areaOfNewTriangles(myPoint) ;
    }

    public double areaOfNewTriangles(MyPoint myPoint){
        MyPoint temp = new MyPoint();
        temp = getP1();
        setP1(myPoint);
        double area1 = getArea();
        setP1(temp);
        temp=getP2();
        setP2(myPoint);
        double area2 = getArea();
        setP2(temp);
        temp = getP3();
        setP3(myPoint);
        double area3 = getArea();
        setP3(temp);

        return area1 + area2 + area3 ;
    }

    public boolean contains(Triangle2D t){
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }

    public boolean overlaps(Triangle2D t){
        return doTheyIntersect(p1 , p3 , t) || doTheyIntersect(p2 , p3 , t) || doTheyIntersect(p1 , p2 , t) ;
    }
    public boolean doTheyIntersect(MyPoint point1, MyPoint point2 ,Triangle2D t){
        return controlEachSide(point1,point2 ,t.p1, t.p2) || controlEachSide(point1,point2,t.p2 , t.p3) ||
                controlEachSide(point1,point2,t.p3 , t.p1);
    }
    public boolean controlEachSide(MyPoint m1 , MyPoint m2 , MyPoint m3 , MyPoint m4){
        double mD1 = (m2.getY()- m1.getY()) / (m2.getX()-m1.getX());
        double mD2 = (m4.getY() - m3.getY()) / (m4.getX() - m3.getX());

        return mD1 != mD2 ;
    }



}
