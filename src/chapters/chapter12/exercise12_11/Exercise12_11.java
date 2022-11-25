package chapters.chapter12.exercise12_11;

import java.io.*;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
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
                    output.print(removedString(str,args[0]));
                    System.out.println("delete");
                }
            }
        }
    }

    public static String removedString(String str,String removerStr){
        String removed = "";
        String[] splitted = str.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            if(splitted[i].equals(removerStr)){
                splitted[i] = "";
            }else {
                removed += splitted[i];
            }
        }
        return removed;
    }
}
