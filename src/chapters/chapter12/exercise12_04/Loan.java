package chapters.chapter12.exercise12_04;

public class Loan extends IllegalArgumentException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() throws IllegalArgumentException {
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate,
     number of years and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) throws IllegalArgumentException {
        setAnnualInterestRate(annualInterestRate);
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
        if(annualInterestRate >= 0) {
            this.annualInterestRate = annualInterestRate;
        } else  {
            throw new IllegalArgumentException("Invalid interest rate ...");
        }
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if(numberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        }else {
            throw new IllegalArgumentException("Invalid number of years ");
        }
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if(loanAmount >= 0){
            this.loanAmount = loanAmount;
        }else {
            throw new IllegalArgumentException("Invalid loan amount");
        }

    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
