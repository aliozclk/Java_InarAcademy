package chapters.chapter12.exercise12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean validInput = true;
        int num1 = 0 ;
        int num2 = 0 ;
        while (validInput) {
            System.out.println("Enter two integers : ");

            try {

                num1 = input.nextInt();

                num2 = input.nextInt();

                 validInput = false;
            }catch (InputMismatchException ex){
                System.out.println("Invalid Input ...");
                input.nextLine();
            }


        }

        System.out.println("Result : "+ ( num1 + num2) );
    }
}
