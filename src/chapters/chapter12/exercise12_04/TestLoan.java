package chapters.chapter12.exercise12_04;

public class TestLoan {
    public static void main(String[] args) {
        Loan loan = new Loan(1,1,1);

        System.out.println(loan);
        Loan loan1 = new Loan(-2,-3,1);
        System.out.println(loan1);
    }
}
