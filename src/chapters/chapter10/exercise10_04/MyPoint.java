package chapters.chapter10.exercise10_04;

public class MyPoint {
    private double x ;
    private double y ;

    public MyPoint(){
        this(0,0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(double x , double y){
        return Math.sqrt((Math.pow(this.getX() - x , 2)+ Math.pow(this.getY() - y , 2)));
    }
    public double distance(MyPoint point){
        return Math.sqrt((Math.pow(this.getX() - point.getX(), 2)+ Math.pow(this.getY() - point.getY(), 2)));
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
