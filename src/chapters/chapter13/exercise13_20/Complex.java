package chapters.chapter13.exercise13_20;

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

    public Complex add(Complex complex){
        return new Complex(complex.getA() + this.a, complex.getB() + this.b);
    }

    public Complex subtract(Complex complex){
        return new Complex(this.a - complex.getA(), this.b - complex.getB());
    }

    public Complex multiply(Complex complex){
        return new Complex(a * complex.a - b * complex.b,
                b * complex.a + a * complex.b);
    }

    public Complex divide(Complex complex){
        return new Complex((a * complex.getA() + b * complex.getB())/ (complex.getA()*complex.getA() + complex.getB()*complex.getB()),
                (b * complex.getA() - a * complex.getB())/ (complex.getA()*complex.getA() + complex.getB()*complex.getB())  );
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
            return "( " + a + " + " + b + "i )";
        }
    }

    public double getRealPart(){
        return getA();
    }

    public double getImaginaryPart(){
        return getB();
    }
}
