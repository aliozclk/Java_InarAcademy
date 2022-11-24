package chapters.chapter12.exercise12_06;

import java.util.Scanner;

public class Hex2Dec {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        if(!hexControl(hex)){
            throw new NumberFormatException(hex + " is not right format" );
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static boolean hexControl(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if(!Character.isDigit(hex.charAt(i)) || Character.toUpperCase(hex.charAt(i)) >= 'A' || Character.toUpperCase(hex.charAt(i)) <= 'F' ){
                return false;
            }
        }
        return true;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}
