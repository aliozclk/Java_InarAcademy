package chapters.Chapter6;

public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.print("i\t\t\t\tm(i)");
        System.out.println("________________________");

        for (int i = 1 ; i <= 20 ; i ++ ){
            System.out.printf("%d\t\t\t\t%.4f\n" , i , sumOfDivision(i));
        }
    }

    public static double sumOfDivision(int num ){
        double sum = 0 ;
        for (int i = 1; i <= num ; i++){
            sum += i / ( i + 1.0) ;
        }

        return sum;
    }

}
