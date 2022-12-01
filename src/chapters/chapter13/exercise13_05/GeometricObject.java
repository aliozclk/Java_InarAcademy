package chapters.chapter13.exercise13_05;

import com.sun.org.apache.xerces.internal.impl.dv.XSSimpleType;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

    public static GeometricObject max(GeometricObject geo1, GeometricObject geo2){
        if(geo1.getArea() >= geo2.getArea()){
            return geo1;
        }else {
            return geo2;
        }
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }else if(this.getArea() == o.getArea()){
            return 0;
        }else {
            return -1;
        }
    }
}

