package chapters.chapter12.exercise12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_21\\SortedString.txt");
        if(!file.exists()){
            throw new FileNotFoundException("File is not exists");
        }

        ArrayList<String> list = new ArrayList<>();

        try(
                Scanner scan = new Scanner(file);
                ) {
            while (scan.hasNext()){
                list.add(scan.nextLine());
            }
        }

        System.out.println("Strings that are out of order :" + getStringsThatAreOutOfOrder(list));

    }

    public static String getStringsThatAreOutOfOrder(ArrayList<String> list){
        String result = "";
        int count = 0 ;
        for (int i = 0; i < list.size(); i++) {
           String[] line = list.get(i).split(" ");
            for (int j = 0; j < line.length-1; j++) {
                    if(line[j].compareTo(line[j+1]) > 0){
                        result += line[j+1] + " ";
                        count++;
                    }
            }
            if (count == 2){
                break;
            }
        }

        return result;
    }
}
