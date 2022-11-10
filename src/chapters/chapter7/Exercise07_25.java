package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] eqn = new double[]{a, b, c};
        double[] roots = new double[2];

        int numOfRoots = solveQuadratic(eqn, roots);
        if(numOfRoots == 0 ){
            System.out.println("There's no real roots.");
        }else {
            System.out.println("The number of real roots is " + numOfRoots);
            System.out.print("The real roots values are: ");
            for (double val : roots ) {
                if (val != 0 ){
                    System.out.print(val);
                }

            }

        }


    }
    public static int solveQuadratic(double[] eqn, double[] roots) {

        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

        if (discriminant < 0) {
            return 0;
        } else if (discriminant == 0) {
            roots[0] = (-1 * eqn[1]) + (Math.pow(discriminant, 0.5) / (2 * eqn[0]));
            return 1;

        } else {
            roots[0] = (-1 * eqn[1]) + (Math.pow(discriminant, 0.5) / (2 * eqn[0]));
            roots[1] = (-1 * eqn[1]) - (Math.pow(discriminant, 0.5) / (2 * eqn[0]));
            return 2;
        }

    }
}
