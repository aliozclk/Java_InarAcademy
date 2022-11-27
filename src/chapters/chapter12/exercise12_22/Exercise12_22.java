package chapters.chapter12.exercise12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) throws Exception {
        if(args.length != 3){
            throw new IllegalArgumentException("Illegal Argument...");
        }

        File dir = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_22\\dir");
        if(!dir.exists()){
            throw new FileNotFoundException("File doesn't exist.");
        }

        if(!dir.isDirectory()){
            throw new Exception("Directory couldn't have been found.");
        }


        File[] files = dir.listFiles();

        for (File f : files) {
            if(f.isFile()){
               changeMatchedStringsInText(f,args[1],args[2]);
            }
        }
    }

    public static void changeMatchedStringsInText(File file, String oldString,String newString) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            list.add(scan.nextLine());
        }
        scan.close();


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(oldString)){
                String[] words = list.get(i).split(" ");
                String temp = "";
                for (int j = 0; j < words.length; j++) {
                    if(words[j].equals(oldString)){
                        words[j] = newString;
                    }
                    temp += words[j] + " ";
                }
                list.set(i,temp);
            }
        }
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }
        pw.close();
    }

}
