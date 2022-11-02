package chapters.Chapter9.Exercise09_09;

public class RegularPolygon {
    private int n ;
    private double side;
    private double x ;
    private double y ;

    RegularPolygon(){
        n = 3 ;
        side = 1 ;
        x = 0 ;
        y = 0;
    }

    RegularPolygon(int n , double side){
        this();
        this.n = n ;
        this.side = side;
    }

    RegularPolygon(int n , double side , double x , double y){
        this(n,side);
        this.x = x ;
        this.y = y ;
    }

    double getSide() {
        return side;
    }

    void setSide(double side) {
        this.side = side;
    }

    int getN() {
        return n;
    }

    void setN(int n) {
        this.n = n;
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    double getPerimeter(){
        return this.n * this.side;
    }

    double getArea(){
        return (n * Math.pow(side,2) )/ 4 * Math.tan(Math.PI / n);
    }
}
