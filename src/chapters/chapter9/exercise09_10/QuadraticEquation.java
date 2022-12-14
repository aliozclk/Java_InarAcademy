package chapters.chapter9.exercise09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        }
        return 0;
    }

    double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        }
        return 0;
    }

}
