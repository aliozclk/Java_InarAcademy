package chapters.Chapter6;

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String s = str.toLowerCase();
        str = "";
        for (int i = 0 ; i < s.length() ; i++){
            if(Character.isLetter(s.charAt(i)) ){
                str += Integer.toString(getNumber(s.charAt(i)));

            }
            else {
                str += s.charAt(i);
            }
        }

        System.out.println(str);

    }
    public static int getNumber(char lowercaseLetter){

        int value = 10 ;

        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(lowercaseLetter);

        if(index >= 23 )
            value = 9 ;
        else if(index >= 20)
            value = 8 ;
        else if(index >= 16)
            value = 7 ;
        else if(index >= 13)
            value = 6 ;
        else if(index >= 10)
            value = 5 ;
        else if(index >= 7)
            value = 4 ;
        else if(index >= 4)
            value = 3 ;
        else if(index >= 1)
            value = 2 ;
        else if(index >= 0)
            value = 0 ;

        return value;
    }
}
