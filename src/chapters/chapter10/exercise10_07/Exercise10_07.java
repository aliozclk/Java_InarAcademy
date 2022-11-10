package chapters.chapter10.exercise10_07;

import java.util.Scanner;

public class Exercise10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        createAccounts(accounts);

        while (true){
            // prompt message
            System.out.println("Enter an id");
            int id = input.nextInt();
            input.nextLine();

            boolean didExitChose = false;
            while (!didExitChose) {
                //Main menu
                System.out.println("Main menu\n" +
                        "1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" +
                        "Enter a choice:");

                //get command from user
                int choice = input.nextInt();
                input.nextLine();
                System.out.println();

                //execute this command
                didExitChose = executeThisChoice(accounts, choice, id);
            }

        }
    }

    private static boolean executeThisChoice(Account[] accounts, int choice,int id) {
        Scanner in = new Scanner(System.in);
        switch (choice){
            case 1 :
                System.out.println("The balance is " + accounts[id].getBalance() );
                System.out.println();
                return false;
            case 2 :
                System.out.println("Enter an amount to withdraw:  " );
                System.out.println();
                int withdrawAmount = in.nextInt();
                in.nextLine();
                accounts[id].withdraw(withdrawAmount);
                return false;
            case 3 :
                System.out.println("Enter an amount to deposit: " );
                System.out.println();
                int depositAmount = in.nextInt();
                in.nextLine();
                accounts[id].deposit(depositAmount);
                return false;
            case 4:
                return true;
        }

        System.out.println("Invalid input. Please make a valid choice ...");
        return false;
    }

    public static void createAccounts(Account[] accounts){
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account((i+1) , 100);
        }
    }

}
