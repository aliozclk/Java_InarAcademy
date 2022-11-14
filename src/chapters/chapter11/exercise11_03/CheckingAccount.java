package chapters.chapter11.exercise11_03;

import chapters.chapter9.exercise09_07.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(){
    }

    public CheckingAccount(int id, double balance){
        super(id, balance);
        this.overdraftLimit = balance * 1.8;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount){
        if(overdraftLimit - amount > 0){
            this.overdraftLimit -= amount;
            this.setBalance(this.getBalance()-amount);
        }
    }

    @Override
    public String toString() {
        return ".....CheckingAccount....." + "\n" +
                "id : " + this.getId() + "\n" +
                "balance: " + this.getBalance() + "\n" +
                "overdraftLimit=" + overdraftLimit + "\n";
    }
}
