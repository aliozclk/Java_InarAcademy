package chapters.Chapter6;

import java.util.Scanner;

public class Exercise06_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first char : ");
        String ch1 = input.nextLine();
        System.out.println("Enter last char : ");
        String ch2 = input.nextLine();
        System.out.println("Number per line : ");
        int num = input.nextInt();

        printChars(ch1.charAt(0), ch2.charAt(0) , num);



    }

    public static void printChars(char ch1, char ch2, int
            numberPerLine){
        int count = 0;
        for (int i = (int) ch1 ; i <= (int) ch2 ; i ++ ){
            System.out.print( ch1 + "" );
            ch1++;
            count++;
            if(count == numberPerLine ){
                System.out.println();
                count = 0;
            }
        }
    }
}
