package chapters.chapter13.exercise13_09;

import chapters.chapter13.exercise13_10.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    /** Return area */ public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    /** Return perimeter */ public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return 0;
    }

    @Override
    public boolean equals(Circle o) {
        return false;
    }
    

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) return 1;
        else if (this.radius < o.radius) return -1;
        else return 0;
    }


    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}