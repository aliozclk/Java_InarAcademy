package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount:");
        double salary = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double annualInterstRate = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        int months = input.nextInt();

        double montlyInterestRate = annualInterstRate / 1200 ;


        System.out.printf("%s\t%s\n","Month","CD Value");
        for ( int i = 1 ; i <= months ; i++) {
            salary = (salary ) * (1 + montlyInterestRate);

            System.out.printf("%-5d%7.2f\n",i, salary);
        }

        input.close();
    }

}
