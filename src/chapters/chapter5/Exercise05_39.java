package chapters.chapter5;

public class Exercise05_39 {
    public static void main(String[] args) {
        final double baseSalary = 5000 ;
        final double requiredSell = 30_000 - baseSalary ;
        double sell = 0;

        for(double commision= 0 ; commision <= requiredSell ; sell++){
            if(sell >= 10000){
               commision =  (sell-10000) * 0.12 + 5_000 * 0.10 + 5_000 * 0.08 ;
            }
            else if (sell >= 5000 ){
                commision = (sell - 5000) * 0.10 + 5000 * 0.08 ;
            }else {
                commision = sell * 0.08 ;
            }


        }

        System.out.println("minimum sales for making  $30,000 is " + sell );

    }
}
