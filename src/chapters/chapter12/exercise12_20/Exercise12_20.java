package chapters.chapter12.exercise12_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            throw new IllegalArgumentException("Illegal Argument...");
        }
        String s = args[0];
        File dir = new File(s);
        if(!dir.isDirectory()){
            throw new Exception(s + " is not a directory");
        }

        listFile(dir);

    }

    public static void listFile(File file) throws FileNotFoundException{
        if(file.isDirectory()){
            for (File f : file.listFiles()){
                listFile(f);
                if(!f.isDirectory()){
                    firstLineRemover(f);
                }

            }

        }
    }

    public static void firstLineRemover(File file) throws FileNotFoundException {
        if(file.getName().contains(".java")){
            ArrayList<String> list = new ArrayList<>();
            try(
                    Scanner scan = new Scanner(file);

            ){ while (scan.hasNext()){
                    list.add(scan.nextLine());
            }

            PrintWriter pw = new PrintWriter(file);


                for (int i = 1; i < list.size(); i++) {
                    pw.println(list.get(i));
            }

                pw.close();

            }
        }
    }

}
