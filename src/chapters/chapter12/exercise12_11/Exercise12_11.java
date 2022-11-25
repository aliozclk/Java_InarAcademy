package chapters.chapter12.exercise12_11;

import java.io.*;
import java.util.ArrayList;
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

        ArrayList<String> list = new ArrayList<>();


        try(

            Scanner scan = new Scanner(file);
        ) {
            while (scan.hasNext()) {
                String s1 = scan.nextLine();
                list.add(s1.replaceAll(args[0],""));
            }
        }

        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < list.size(); i++) {
            output.println(list.get(i));
        }
        output.close();
    }


}
