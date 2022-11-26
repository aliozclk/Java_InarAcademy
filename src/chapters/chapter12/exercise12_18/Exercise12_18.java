package chapters.chapter12.exercise12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            throw new IllegalArgumentException("Illegal Argument...");
        }
        String s = args[0];
        File dir = new File(s);
        if(!dir.isDirectory()){
            throw new Exception(s + " is not a directory");
        }

        searchDirectories(dir);

    }

    public static void searchDirectories(File file) throws FileNotFoundException,IOException {
        if(file.isDirectory()){
            for (File f : file.listFiles()){
                searchDirectories(f);
                if(!f.isDirectory()){
                    addFirstLine(f);
                }

            }

        }
    }

    public static void addFirstLine(File file) throws IOException {

        if(file.getName().contains(".java")){
            ArrayList<String> list = new ArrayList<>();
            list.add(file.getCanonicalPath());
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
