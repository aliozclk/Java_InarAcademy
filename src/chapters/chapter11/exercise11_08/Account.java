package chapters.chapter11.exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    private ArrayList<Transaction> transactions;
    private String name;
    private int id; // 0
    private double balance ; //0
    private double annualInterestRate; //0
    private Date dateCreated;//date when account created

    public Account(){
        this(0,0);
    }
    public Account(int id , double balance ) {
        this("",0,0);
    }

    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
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
        Transaction t = new Transaction('W',amount,balance,"Money has withdrawn ");
        transactions.add(t);
    }

    public void deposit(double amount){
        balance += amount;
        Transaction t = new Transaction('D',amount,balance,"Money has deposited. ");
        transactions.add(t);
    }

    @Override
    public String toString() {
        return ".......Account......\n" +
                "Name : " + this.name + " "+
                "id=" + id + "\n" +
                "balance=" + balance + "\n" +
                "annualInterestRate=" + annualInterestRate + "\n" +
                "dateCreated=" + dateCreated + "\n" +
                 "";
    }
}
