package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfBanks = input.nextInt();

        double limit = input.nextDouble();
        int count = 0 ;
        double[][]  borrowers = new double[numOfBanks][numOfBanks];
        boolean unsafe = false;

        while (count < numOfBanks){
            borrowers[count][count] = input.nextDouble();
            int numOfLoans = input.nextInt();

            for (int i = 0; i < numOfLoans; i++) {
                int loanToBankId = input.nextInt();
                borrowers[count][loanToBankId] = input.nextDouble();

            }

            int balance = 0 ;
            for (int loanee = 0; loanee < numOfBanks; loanee++) {
                balance += borrowers[count][loanee];
            }
            if(balance < limit){
                for (int i = 0; i < numOfBanks; i++) {
                    borrowers[i][count] = 0 ;
                    unsafe = true;
                }
            }
            count++;
        }

        if(unsafe){
            System.out.print("Unsafe banks are ");
            for (int row = 0; row < borrowers.length; row++) {
                int balance = 0;
                for (int col = 0; col < borrowers.length; col++) {
                    balance += borrowers[row][col];
                }
                if(balance < limit){
                    System.out.print(row + " ");
                }

            }
        }




    }
}
