package chapters.chapter13.exercise13_17;

public class Complex {
    private double a;
    private double b;

    public Complex(){
        this(0);
    }
    public Complex(double a){
        this(a,0);
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void add(Complex complex){
        this.a += complex.getA();
        this.b += complex.getB();
    }

    public void subtract(Complex complex){
        this.a -= complex.getA();
        this.b -= complex.getB();
    }

    public void multiply(Complex complex){
        a = (a * complex.getA() - b * complex.getB());
        b = b * complex.getA() + a * complex.getB();
    }

    public void divide(Complex complex){
        a = (a * complex.getA() + b * complex.getB())/ (complex.getA()*complex.getA() + complex.getB()*complex.getB());
        b = (b * complex.getA() - a * complex.getB())/ (complex.getA()*complex.getA() + complex.getB()*complex.getB());
    }

    public double abs(){
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        if(b == 0){
            return ""+ a;
        }
        else {
            return "" + a + " + " + b + "i";
        }
    }

    public double getRealPart(){
        return getA();
    }

    public double getImaginaryPart(){
        return getB();
    }
}
