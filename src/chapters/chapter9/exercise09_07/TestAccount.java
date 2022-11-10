package chapters.chapter9.exercise09_07;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122 , 20_000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance : " + account.getBalance() +
                "\nMonthly Interest : " + account.getMonthlyInterest() +
                "\nAccount date :" + account.getDateCreated());
    }
}
