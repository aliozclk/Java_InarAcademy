package chapters.chapter12.exercise12_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws  FileNotFoundException{
        if (args.length != 1) {
            throw new IllegalArgumentException("Illegal Input...");
        }


        File file = new File(args[0]);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + args[0] + " does not exist");
        }

        ArrayList<String> list = new ArrayList<>();
        try(
                Scanner scan = new Scanner(file);
        ) {
            while (scan.hasNext()) {
                String s1 = scan.nextLine();
                list.add(s1);
            }
        }
        PrintWriter pw = new PrintWriter(file);
        for (int i = 1; i < list.size(); i++) {
            String str = list.get(i);
            if(str.contains("{")){
                str = str.replace('{',' ');
                String temp = list.get(i-1);
                temp = temp + " {";
                list.set(i, str);
                list.set(i-1 , temp);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }
        pw.close();
        System.out.println(file.getAbsolutePath());
    }
}

