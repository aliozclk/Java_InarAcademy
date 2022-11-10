package chapters.chapter6;

public class Exercise06_27 {
    public static void main(String[] args) {

        int count = 1 ;
        int i = 2;
        while (count <= 100 ){

            if(isPrime(i) && isPrime(reverse(i)) && !isPalindromic(i)){
                System.out.print(i + " ");

                if(count % 10 == 0 ){
                    System.out.println();
                }
                count++;
            }

            i += 1 ;
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

    public static int reverse(int num){
        String reversed = "";
        String number = Integer.toString(num);

        for (int i = number.length() - 1 ; i >= 0; i--) {

            reversed += number.charAt(i);

        }

        return Integer.parseInt(reversed);
    }

    public static boolean isPalindromic(int num){
        String reversed = "";
        String number = Integer.toString(num);

        for (int i = number.length() - 1 ; i >= 0; i--) {

            reversed += number.charAt(i);

        }

        return reversed.equals(number);
    }
}
