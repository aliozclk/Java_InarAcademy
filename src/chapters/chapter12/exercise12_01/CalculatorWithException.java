package chapters.chapter12.exercise12_01;

import java.io.IOException;

public class CalculatorWithException {
    public static void main(String[] args) throws NumberFormatException {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            return;
        }

        // The result of the operation
        try {

            int result = getResult(args);
        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
        }
    }
    public static int getResult(String[] args) throws NumberFormatException{
        int result = 0;
        switch (args[1].charAt(0)) {
            case '+': result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);

        return result;
    }

}
