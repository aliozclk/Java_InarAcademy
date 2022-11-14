package chapters.chapter11.exercise11_08;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("George",1122,1000);

        account.setAnnualInterestRate(0.015);
        account.deposit(30);
        account.withdraw(5);
        account.deposit(40);
        account.withdraw(4);
        account.deposit(50);
        account.withdraw(2);
        System.out.println(account.toString());
        System.out.println("Transactions :");
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println(account.getTransactions().get(i).toString());

        }
    }
}
