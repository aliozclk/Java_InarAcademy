package chapters.chapter10;

public class Exercise10_26 {
    public static void main(String[] args) {


        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+' : result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' : result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' : result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

}
