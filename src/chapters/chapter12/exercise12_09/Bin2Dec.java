package chapters.chapter12.exercise12_09;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();

        try {
            System.out.println("The decimal value for binary number "
                    + bin + " is " + bin2Dec(bin.toUpperCase()));
        }catch (BinaryFormatException ex){
            System.out.println(ex.getBin());
        }
    }

    public static int bin2Dec(String bin) throws BinaryFormatException {

        if(!binControl(bin)){
            throw new BinaryFormatException(bin + " is not right format" );
        }else{
            return Integer.parseInt(bin,2);
        }

    }

    public static boolean binControl(String bin) {
        for (int i = 0; i < bin.length(); i++) {
            if(!(bin.charAt(i) >= '0' && bin.charAt(i) <= '1' )){
                return false;
            }
        }
        return true;
    }


}
