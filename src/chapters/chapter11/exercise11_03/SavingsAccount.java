package chapters.chapter11.exercise11_03;

import chapters.chapter9.exercise09_07.Account;

public class SavingsAccount extends Account {

    public SavingsAccount(){

    }
    public SavingsAccount(int id, double balance){
        super(id,balance);
    }

    public void withdraw(double amount){
        if(amount < getBalance()){
            this.setBalance(this.getBalance()-amount);
        }
    }

    @Override
    public String toString() {
        return "......SavingsAccount......" + "\n" +
                "Id : " + this.getId() + "\n" +
                "Balance" + this.getBalance();
    }
}
