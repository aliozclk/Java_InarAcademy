package homework.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise20_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\test\\sample.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> list = new ArrayList<>();
        while (scan.hasNext()){
            list.add(scan.nextLine());
        }
        scan.close();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i).split("\\s");
            for (int j = 0; j < str.length - 1; j++) {
                words.add(str[j]);
            }
        }

        for (int i = 0; i < words.size() - 1; i++) {
            String minStr = words.get(i);
            int minIndex = i;
            for (int j = 0; j < words.size(); j++) {
                if(minStr.compareToIgnoreCase(words.get(j)) > 0 ){
                    minStr = words.get(j);
                    minIndex = j;
                }
            }
            sorted.add(minStr);
            words.remove(minIndex);
        }

        for (int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }


    }
}
