package chapters.chapter11.exercise11_03;

import chapters.chapter9.exercise09_07.Account;

public class exercise11_03 {
    public static void main(String[] args) {
        Account account = new Account(153, 2500);
        CheckingAccount checkingAccount = new CheckingAccount(154, 2800);
        SavingsAccount savingsAccount = new SavingsAccount(155, 3200);

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());

        checkingAccount.withdraw(3000);
        System.out.println(checkingAccount.toString());
        checkingAccount.withdraw(2050);
        System.out.println(checkingAccount.toString());
    }
}
