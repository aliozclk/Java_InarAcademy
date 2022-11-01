package chapters.Chapter9.Exercise09_07;

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



}
