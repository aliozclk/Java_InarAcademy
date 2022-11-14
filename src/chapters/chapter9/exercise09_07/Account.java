package chapters.chapter9.exercise09_07;

import java.util.Date;

public class Account {
    private int id; // 0
    private double balance ; //0
    private double annualInterestRate; //0
    private Date dateCreated;//date when account created

    public Account(){
        dateCreated = new Date();
    }
    public Account(int id , double balance ){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest(){
        return balance * (getAnnualInterestRate() / 12) ;
    }

    public void withdraw(double amount){
        balance -= amount ;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return ".......Account......\n" +
                "id=" + id + "\n" +
                "balance=" + balance + "\n" +
                "annualInterestRate=" + annualInterestRate + "\n" +
                "dateCreated=" + dateCreated ;
    }
}
