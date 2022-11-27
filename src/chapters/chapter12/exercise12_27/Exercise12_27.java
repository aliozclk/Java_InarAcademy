package chapters.chapter12.exercise12_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_27 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter10");

        searchDirectories(dir);



    }
    public static void addZeroBeforeSingleDigit(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();

        while (scan.hasNext()){
            list.add(scan.nextLine());
        }
        scan.close();


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).contains("Exercise")){
                String[] splittedLine = list.get(i).split(" ");
                String temp = "";
                for (int j = 0; j < splittedLine.length; j++) {
                    if(splittedLine[j].contains("Exercise") && list.get(i).length() < 28){
                        String digits = splittedLine[j].substring(8);
                        String[] splittedDigits = digits.split("_");
                        if(Integer.parseInt(splittedDigits[0]) < 10 && !splittedDigits[0].contains("0")){
                            splittedDigits[0] = "0" + splittedDigits[0];
                        }
                        if(Integer.parseInt(splittedDigits[1]) < 10 && !splittedDigits[1].contains("0")){
                            splittedDigits[1] = "0" + splittedDigits[1];
                        }
                        splittedLine[j] = "Exercise"+ splittedDigits[0] + "_" + splittedDigits[1];
                    }
                    temp += splittedLine[j] + " ";
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

    public static void searchDirectories(File file) throws FileNotFoundException, IOException {
        if(file.isDirectory()){
            for (File f : file.listFiles()){
                searchDirectories(f);

            }

        } else if(!file.isDirectory()){
            addZeroBeforeSingleDigit(file);
        }
    }
}
