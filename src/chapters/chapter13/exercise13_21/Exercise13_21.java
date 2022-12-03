package chapters.chapter13.exercise13_21;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double h = -b / (a * 2 ) ;
        double k = c - Math.pow(h,2);

        int realH = (int) h;
        String imageH = "" + (h - realH);
        imageH = imageH.substring(imageH.indexOf('.') +1 );

        Rational rationalH = new Rational(BigInteger.valueOf(realH), BigInteger.ONE);
        if(realH >= 0 ){
            rationalH = rationalH.add(new Rational(BigInteger.valueOf(Long.parseLong(imageH)), BigInteger.valueOf((long)Math.pow(10,imageH.length()))));
        }else {
            rationalH = rationalH.subtract(new Rational(BigInteger.valueOf(Long.parseLong(imageH)), BigInteger.valueOf((long)Math.pow(10,imageH.length()))));
        }

        int realK = (int) k ;
        String imageK = "" + (k - realK);
        imageK = imageK.substring(imageK.indexOf('.') + 1);

        Rational rationalK = new Rational(BigInteger.valueOf(realK), BigInteger.ONE);
        if(realK >= 0){
            rationalK = rationalK.add(new Rational(BigInteger.valueOf(Long.parseLong(imageK)), BigInteger.valueOf((long)Math.pow(10,imageK.length()))));
        }else {
            rationalK = rationalK.subtract(new Rational(BigInteger.valueOf(Long.parseLong(imageK)), BigInteger.valueOf((long)Math.pow(10,imageK.length()))));
        }

        System.out.println("h is " + rationalH.toString()  + ", k is " + rationalK.toString());
    }
}
