package chapters.chapter13.exercise13_16;

public class Test13_16 {
    public static void main(String[] args) {
        if(args.length != 1){
            throw new IllegalArgumentException("Illegal input...");
        }


        String[] input = args[0].split(" ");

        String[] operand1 = input[0].split("/");
        String[] operand2 = input[2].split("/");
        String operator = input[1];

        Rational num1 = new Rational(Integer.parseInt(operand1[0]),Integer.parseInt(operand1[1]));
        Rational num2 = new Rational(Integer.parseInt(operand2[0]),Integer.parseInt(operand2[1]));

        String print = args[0];
        switch (operator){
            case "+" : print += " = " + num1.add(num2);
                break;
            case "-" : print += " = " + num1.subtract(num2);
                break;
            case "*" : print += " = " + num1.multiply(num2);
                break;
            case "/" : print += " = " + num1.divide(num2);
                break;
        }

        System.out.println(print);


     }
}
