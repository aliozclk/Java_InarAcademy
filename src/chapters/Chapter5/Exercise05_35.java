package chapters.Chapter5;

public class Exercise05_35 {
    public static void main(String[] args) {
        double sum = 0 ;
        for (double n = 1 ; n <= 624 ; n++ ){
            sum += 1/(Math.sqrt(n) + Math.sqrt(n+1))  ;
        }
        System.out.println("The sum is : " + sum );
    }
}
