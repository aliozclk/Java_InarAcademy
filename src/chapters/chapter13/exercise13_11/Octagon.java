package chapters.chapter13.exercise13_11;

public class Octagon extends GeometricObject implements Comparable<Octagon> , Cloneable {

    private double side;

    public Octagon(){
        this(0);
    }

    public Octagon(double side){
        super("",false);
        this.side = side;
    }


    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea()){
            return 1;
        }else if(this.getArea() == o.getArea()){
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
