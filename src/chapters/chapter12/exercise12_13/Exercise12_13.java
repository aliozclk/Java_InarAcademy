package chapters.chapter12.exercise12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 1){
            throw new IllegalArgumentException("Illegal input...");
        }
        File file = new File(args[0]);
        if (!file.exists()){
            throw new FileNotFoundException("File doesn't exist...");
        }
        int numOfChars = 0;
        int numOfWords = 0;
        int numOfLines = 0;

        try(
                Scanner scan = new Scanner(file);
        ){
            while (scan.hasNextLine()){
                numOfLines++;
                String s = scan.nextLine();
                numOfChars += s.length();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ' '){
                        numOfWords++;
                    }

                }
                numOfWords++;
            }
        }

        System.out.println("Number of lines : " + numOfLines + "\n Number of chars : " + numOfChars + "\n Number of words : " + numOfWords);




    }
}
