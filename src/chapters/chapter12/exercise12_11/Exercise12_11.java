package chapters.chapter12.exercise12_11;

import java.io.*;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        if(args.length != 2 ){
            System.out.println("Illegal argument input");
            throw new IllegalArgumentException("Illegal argument");
        }

        String[] commandline = new String[2];
        commandline = args[0].split(" ");
        File file = new File(commandline[1]);
        String str = "";
        String out = "";
        try(
            PrintWriter output = new PrintWriter(file);
            Scanner scan = new Scanner(file);
        ) {
            while (scan.hasNext()) {
                System.out.println("File exist: " + file.exists());

                str = scan.nextLine();
                if(str.equals(commandline[0])){
                    str.replace(commandline[0],"");
                    output.print(str);
                }


            }
        }

    }
}
