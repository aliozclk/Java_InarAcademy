package chapters.Chapter10.Exercise10_04;

public class MyPoint {
    private double x ;
    private double y ;

    MyPoint(){
        this(0,0);
    }
    MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double distance(double x , double y){
        return Math.sqrt((Math.pow(this.x - x , 2)+ Math.pow(this.y - y , 2)));
    }
    public double distance(MyPoint point){
        return Math.sqrt((Math.pow(this.x - point.x , 2)+ Math.pow(this.y - point.y , 2)));
    }

}
