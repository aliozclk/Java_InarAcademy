package chapters.Chapter5;

public class Exercise05_33 {
    public static void main(String[] args) {
        boolean perfectNumber = false;
        System.out.println("Perfect Numbers are : ");
        for (int number = 5 ; number <= 10_000 ; number++ ){
            int sum = 0 ;
            for (int i = 1 ; i < number ; i++){
                if (( number % i ) == 0 )
                    sum += i ;
            }
            if (number == sum ) {

                System.out.print(number + ", ");
            }
        }
    }
}
