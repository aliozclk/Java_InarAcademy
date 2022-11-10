package chapters.chapter6;

import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password : ");
        String password = input.nextLine();

        passwordControl(password);
    }
    public static void passwordControl(String password){
        if(lengthLimit(password) && isConsistOnlyLetterOrNumber(password) && isConsistMoreThanTwoDigits(password)){
            System.out.println("Valid password.");
        }else {
            System.err.println("Invalid password");
        }
    }
    public static boolean lengthLimit(String password){

        return password.length() >= 8 ;
    }
    public static boolean isConsistOnlyLetterOrNumber(String password){

        for (int i = 0 ; i < password.length() ; i++ ){
            if ( ! (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static boolean isConsistMoreThanTwoDigits(String password){
        int count = 0 ;
        for (int i = 0 ; i < password.length() ; i++ ){
            if (Character.isDigit(password.charAt(i))){
                count++;
            }

        }
        return count >= 2 ;
    }
}
