package weeks.week_16;

public abstract class Cizgi extends GeometricObject {
    private double length;

    public double getPerimeter(){
        return this.length;
    }

    public abstract void print();

}
