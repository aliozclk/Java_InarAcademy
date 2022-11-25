package chapters.chapter12.exercise12_12;

import java.io.*;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws  FileNotFoundException{
        if (args.length != 2) {
            throw new IllegalArgumentException("Illegal Input...");
        }


        File file = new File(args[1]);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + args[1] + " does not exist");
        }


        String str = "";
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        try(
                PrintWriter output = new PrintWriter(file);
                Scanner scan = new Scanner(file);
        ) {
            while (scan.hasNext()) {


                str += scan.next();
                if(str.contains("John")){
                    output.print(nextLineBraces(str));
                    System.out.println("delete");
                }
            }
        }
    }

    public static String nextLineBraces(String str){
        String nextLineBrace = "";
        String[] splitted = str.split(" ");

        for (int i = 0; i < splitted.length-1; i++) {
            if(splitted[i+1].equals("{")){
                splitted[i] += "\n";
            }else {
                nextLineBrace += splitted[i];
            }
        }
        return nextLineBrace;
    }
}

