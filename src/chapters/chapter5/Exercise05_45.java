package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double sumSquare = 0;
        System.out.println("Enter ten numbers: ");
        for (int i = 0 ; i < 10 ; i++ ){
            double num = input.nextDouble();
            sum += num ;
            sumSquare += (num * num) ;
        }
        double mean = sum / 10;
        System.out.println("The mean is "+ mean );

        double deviation = Math.pow(((sumSquare - ((sum*sum) / 10 )) / 9 ), 0.5) ;
        System.out.printf("%s%.5f" ," The standard deviation is " , deviation);

    }
}
