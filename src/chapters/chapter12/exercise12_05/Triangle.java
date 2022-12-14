package chapters.chapter12.exercise12_05;

import chapters.chapter11.exercise11_01.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException{
        this(1,1,1);
    }
    public Triangle(double side1 , double side2 , double side3)throws IllegalTriangleException {
        this("",false,side1,side2,side3);
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3) throws IllegalTriangleException {
        super(color, filled);
        if(triangleControl(side1,side2,side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else {
            throw new IllegalTriangleException(side1,side2,side3);
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/ 2 ;
        return Math.pow((s*(s-side1)* (s- side2)* (s- side3)), 0.5);
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "Triangle : " +
                " side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 ;
    }

    public boolean triangleControl(double side1,double side2 , double side3){
        if(side1 > side2 + side3){
            return false;
        } else if (side2 > side1 + side3) {
            return false;
        } else if (side3 > side1 + side2) {
            return false;
        }
        return true;

    }
}
