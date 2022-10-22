package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511: ");
        int num = input.nextInt();

        char[][] coin =new char[3][3];


        fillThisArrayWithHeadsOrTails(coin,num);

        printArray(coin);


    }

    public static void fillThisArrayWithHeadsOrTails(char[][] coin , int num){
        String binaryNum = "";
        String binNum = Integer.toBinaryString(num);
        for (int i = 0; i < 9 - binNum.length() ; i++) {
            binaryNum += "0";
        }
        binaryNum = binaryNum + binNum;

        int count = 0;
        for (int row = 0; row < coin.length; row++) {

            for (int col = 0; col < coin[row].length; col++) {
                if (binaryNum.charAt(count) == '0') {
                    coin[row][col] = 'H';
                } else {
                    coin[row][col] = 'T';
                }
                count++;
            }
        }
    }

    public static void printArray(char[][] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].length; col++) {
                System.out.print(chars[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
