package chapters.chapter12.exercise12_01;

public class CalculatorWithoutException {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            return;
        }
        if(digitControl(args[0]) || digitControl(args[2])){
            return;
        }


        int result = getResult(args);

        System.out.println("Invalid Input");
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

    public static boolean digitControl(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("Wrong Input " + str);
            }
        }
        return true;
    }
}
