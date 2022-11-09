package chapters.Chapter10.exercise10_07;

import java.util.Date;

public class Account {
    private int id; // 0
    private double balance ; //0
    private double annualInterestRate; //0
    private Date dateCreated;//date when account created

    Account(){
        dateCreated = new Date();
    }
    Account(int id , double balance ){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    int getId(){
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterest(){
        return balance * (getAnnualInterestRate() / 12) ;
    }

    void withdraw(double amount){
        balance -= amount ;
    }

    void deposit(double amount){
        balance += amount;
    }

}
