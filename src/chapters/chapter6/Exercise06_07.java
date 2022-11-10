package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        System.out.println("Enter number of years: ");
        double years = input.nextDouble();
        input.close();

        double monthlyInterestRate = interestRate / 12 ;

        System.out.printf("%s\t\t½14s\n","Years","Future Value");

        for(int i = 1 ; i <= years ; i++ ){
            System.out.printf("%d\t\t%-14.2f\n",i, futureInvestmentValue(amount,monthlyInterestRate,i));

        }


    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){

        return investmentAmount * Math.pow((1 + monthlyInterestRate  / 100), years * 12 );


    }
}
