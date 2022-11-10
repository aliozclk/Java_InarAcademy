package chapters.chapter10.exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D(){
        this(0,0,1);
    }

    Circle2D(double x , double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(radius,2));
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius ;
    }

    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(x-this.x,2)+ Math.pow(y - this.y , 2));
        return distance < radius ;
    }

    public boolean contains(Circle2D circle){
        return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2))
                <= Math.abs(radius - circle.getRadius());
    }

    public boolean overlaps(Circle2D circle){
        double centerDistance = Math.sqrt(Math.pow(circle.x-this.x,2) + Math.pow(circle.y - this.y , 2));
        return  centerDistance < this.radius + circle.radius ;

    }
}
