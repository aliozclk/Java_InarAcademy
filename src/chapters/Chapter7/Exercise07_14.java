package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers: ");
        readThem(numbers,input);
        System.out.println("Gcd : " + gcd(numbers));



    }

    public static int gcd(int... numbers){
        int min = getMin(numbers);
        boolean isDivisor = true;

        for (int i = min; i >= 1  ; i--) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] % i != 0 ){
                    isDivisor = false;
                    break;
                }else {
                    isDivisor = true ;
                }
            }
            if(isDivisor){
                return i ;
            }
        }

        return 1 ;

    }
    public static void readThem(int[] numbers,Scanner input) {
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();

        }
    }

    public static int getMin(int[] array){
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
