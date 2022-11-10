package chapters.chapter6;

public class Exercise06_14 {
    public static void main(String[] args) {

        System.out.println("i\t\t\t\t\tm(i)");
        System.out.println("_____________________________");
        for (double i = 1 ; i < 1000 ; i += 100 ){
            System.out.printf("%.0f\t\t\t\t\t%.4f\n", i , m(i));

        }
    }

    public static double m(double num) {
        double quarterPi = 0;

        for (double i = 1; i <= num; i++) {
            quarterPi += Math.pow(-1, (i + 1)) / (2 * i - 1);


        }
        return 4 * quarterPi;
    }
}
