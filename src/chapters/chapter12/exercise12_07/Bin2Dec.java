package chapters.chapter12.exercise12_07;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a binary number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for binary number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {

        if(!hexControl(hex)){
            throw new NumberFormatException(hex + " is not right format" );
        }else{
            return Integer.parseInt(hex,2);
        }

    }

    public static boolean hexControl(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if(Character.isDigit(hex.charAt(i)) && hex.charAt(i) >= '0' && hex.charAt(i) <= '1' ){
                return true;
            }
        }
        return false;
    }


}
