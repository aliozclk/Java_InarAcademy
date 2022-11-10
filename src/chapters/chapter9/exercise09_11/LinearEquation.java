package chapters.chapter9.exercise09_11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a,double b,double c,double d,double e,double f ){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    boolean isSolvable(){
       return a * d - b * c != 0 ;
    }
    double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }

    double getY(){
        return (a*f - e*c) / (a*d - b*c);
    }


}
