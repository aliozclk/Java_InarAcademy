package chapters.chapter6;

public class Exercise06_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000 ; i++) {
            if (isPrime(i) && isPrime(i+2)){
                System.out.println("(" + i + "," + (i+2) + ")");
            }
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0 ){
                return false;
            }

        }
        return true;
    }


}
