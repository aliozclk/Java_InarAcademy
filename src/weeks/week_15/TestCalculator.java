package weeks.week_15;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number : ");
        Calculator calculator = new Calculator(input.nextDouble(), input.nextDouble());
        input.nextLine();

        System.out.println("Enter process( + , - , / , * , %(mod) , c(clear), s(change number's sign) : ");
        String process = input.nextLine();
        chooseProcess(process,calculator, input);
    }

    public static void chooseProcess(String str , Calculator calculator , Scanner input){
        if(str.charAt(0) == 's' ){
            System.out.println("Enter process( + , - , / , * , %(mod) , c(clear), s(change number's sign) : ");
            String process = input.nextLine();

        }
        System.out.println("The result is : ");
        char ch = str.charAt(0);
        switch (ch){
            case '+' : calculator.getSum();
                System.out.println(calculator.getResult().getValue());
                break;
            case  '-' : calculator.getSubtract();
                System.out.println(calculator.getResult().getValue());
                break;
            case '/' :  calculator.getDivide();
                System.out.println(calculator.getResult().getValue());
                break;
            case '*' : calculator.getMultiply();
                System.out.println(calculator.getResult().getValue());
                break;
            case '%' : calculator.getRemainder();
                System.out.println(calculator.getResult().getValue());
                break;
            case 'c' : calculator.clear();
                System.out.println("0000");
                break;
            case 's' : calculator.change(calculator.getNumber2());
                System.out.println("Second Number is : " + calculator.getNumber2().getValue());
                System.out.println("Enter process( + , - , / , * , %(mod) , c(clear), s(change number's sign) : ");
                chooseProcess(input.nextLine(), calculator, input);
        }
    }
}
