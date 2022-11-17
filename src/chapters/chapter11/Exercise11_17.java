package chapters.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> factorList = new ArrayList<>();
        ArrayList<Integer> productOfFactors = new ArrayList<>();

        System.out.println("Enter an integer m:");
        int m = input.nextInt();
        getTheseFactors(factorList,m);
        getProductOfFactors(factorList,productOfFactors);
        int perfectSquare = getPerfectSquare(productOfFactors);

        System.out.println("The smallest number n for m * n to be a perfect square is " + perfectSquare);
        System.out.println("m * n is " + (m * perfectSquare));
    }
    public static void getTheseFactors(ArrayList<Integer> factorList, int m){
        for (int i = 2; i < 100; i++) {
           do {
               if(isPrime(i)){
                  if(m % i == 0 ){
                      m = m / i;
                      factorList.add(i);
                  }
                  else {
                      break;
                  }
               }

           }while (isPrime(i));
            if(m == 1 ){
                break;
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
                }
            }
        return true;
    }
    public static void getProductOfFactors(ArrayList<Integer> factorList, ArrayList<Integer> productOfFactors){
        for (int i = 0; i < factorList.size();i++) {
            int factor = factorList.get(i);
            int numberOfFactor = 1 ;
            for (int j = i + 1 ; j < factorList.size(); j++) {
                if(factor == factorList.get(j)){
                    numberOfFactor++;
                }
            }
            if(numberOfFactor % 2 == 1){
                productOfFactors.add(factor);
            }
            i = factorList.lastIndexOf(factor);
        }
    }
    public static int getPerfectSquare(ArrayList<Integer> list){
        int total = 1;
        for (int i = 0; i < list.size(); i++) {
            total *= list.get(i);
        }
        return total;
    }

}
