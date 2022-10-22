package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_12 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print(
                "(0-single filer, 1-married jointly or qualifying widow(er), "
                        + "\n2-married separately, 3-head of household)\n" +
                        "Enter the filing status: ");
        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly// -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};



        // Compute tax
        double tax = computeTaxByValues(brackets,rates,income,status);



        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }

    public static double computeTaxByValues(int[][] brackets , double[] rates ,double income , int status){
        double tax = brackets[status][0] * rates[0];
        int count = 0 ;
        for (int col = 1;  col < brackets[status].length ; col++) {
            if (brackets[status][col] > income ){
                break;
            }
            tax += (brackets[status][col] - brackets[status][col-1]) * rates[col];
            count = col ;
        }
        tax += (income - brackets[0][count]) * rates[count+1];
        return tax;
    }
}
