package chapters.chapter5;

import java.util.Scanner;

public class Exercise05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int keyboard = input.nextInt();

        int num = keyboard ;
        int i = 0 ;
        int binaryNum = 0 ;

        while (Math.pow(2,i) <= num){
            i++;
        }

        for(int j = 0 ; j <= i ; j++  ){
            binaryNum += (num%2) * Math.pow(10, j );
            num = num/2 ;

        }
        System.out.println("binary value of " +keyboard + " is " + binaryNum );

    }
}
