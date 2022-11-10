package chapters.chapter6;

public class Exercise06_11 {
    public static void main(String[] args) {

        System.out.println("Sales Amount\t\tCommission");
        System.out.println("______________________________");

        for(double i = 10_000 ; i <= 100_000 ; i += 5000 ){
            System.out.printf("%-12.0f\t\t%6.1f\n", i , computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount){
        if(salesAmount >= 10000){
            return   (salesAmount-10000) * 0.12 + 5_000 * 0.10 + 5_000 * 0.08 ;
        }
        else if (salesAmount >= 5000 ){
            return  (salesAmount - 5000) * 0.10 + 5000 * 0.08 ;
        }else {
            return salesAmount * 0.08 ;
        }
    }
}
