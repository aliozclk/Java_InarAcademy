package chapters.Chapter6;

import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
        long cardNum = input.nextLong();

        if(isValid(cardNum)){
            System.out.println(cardNum + " is valid ");

        }else {
            System.out.println(cardNum + " is invalid.");
        }

    }

    public static boolean isValid(long number){


        if(getSize(number) < 13 && getSize(number) < 18 ){
            return false;
        }else {
            int sum1 =sumOfDoubleEvenPlace(number);
            int sum2 = sumOfOddPlace(number);

            return (sum2+ sum1) % 10 == 0 &&( prefixMatched(number,4) ||
                    prefixMatched(number,5) || prefixMatched(number, 37 ) || prefixMatched(number, 6));
        }

    }
    public static int sumOfOddPlace(long number){
        String card = Long.toString(number);
        int sum = 0;

        for (int i = card.length() - 1 ; i >= 0  ; i -= 2) {
            String temp = "" + card.charAt(i);
            int a = Integer.parseInt(temp);

            sum += a;

        }
        return sum;

    }

    public static int getDigit(int number){
        return (number / 10) + (number % 10) ;

    }

    public static int sumOfDoubleEvenPlace(long number){

        String card = Long.toString(number);
        int sum = 0;

        for (int i = card.length() - 2 ; i >= 0  ; i -= 2) {
            String temp = "" + card.charAt(i);
            int a = Integer.parseInt(temp) * 2;
            if(a > 9 ){
                a = getDigit(a);
            }
            sum += a;

        }
        return sum;



    }

    public static boolean prefixMatched(long number, int d){
        long pre = getPrefix(number,2);
        if(d < 10){
            d = d * 10  +(int) (pre % 10) ;
        }
        return d == pre ;

    }

    public static int getSize(long d){

        String card = Long.toString(d);
        int size = card.length();

        return size;

    }

    public static long getPrefix(long number, int k){

        String card = Long.toString(number);
        long num = 0;
        num = Long.parseLong(card.substring(0,k));
        return num;

    }

}
