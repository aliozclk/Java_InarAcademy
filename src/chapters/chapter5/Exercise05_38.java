package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int keyboard = input.nextInt();

        int num = keyboard ;
        int i = 0 ;
        String octalValue = "" ;

        while (Math.pow(16,i) <= num){
            i++;
        }
        for(int j = 0 ; j < i ; j++  ){
           if(num % 16 > 10 ){
               octalValue += (char)('A' +( num % 16 - 10 ) );
           }
           else {
               octalValue += Integer.toString( num % 16 );
           }
           num /= 16 ;

        }
        System.out.print("Octal value of " +keyboard + " is "  );

        for (int k = octalValue.length()- 1 ; k >= 0 ; k-- ){
            System.out.print(octalValue.charAt(k));
        }
        System.out.println();
    }
}
