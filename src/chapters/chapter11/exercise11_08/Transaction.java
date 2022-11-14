package chapters.chapter11.exercise11_08;

import java.util.Date;

public class Transaction {
    private Date date ;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(){
        this(' ',0,0,"");
    }
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
