package chapters.chapter12.exercise12_32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_32 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("________________________________________________________________________________________________________________");
        System.out.printf("%-6s","Year");
        for (int i = 1; i < 6; i++) {
            System.out.printf("%-5s%-5d" ,"Rank", i);
        }
        for (int i = 1; i < 6; i++) {
            System.out.printf("%-5s%-5d" ,"Rank", i);
        }
        System.out.println();
        System.out.println("____________________________________________________________________________________________________________________");

        for (int year = 2010 ; year >= 2001 ; year--) {
            System.out.printf("%-6d", year );

            File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_31\\babynameranking"+year+".txt");
            Scanner scan = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();

            while (scan.hasNext()){
                list.add(scan.nextLine());
            }
            scan.close();

            for (int i = 0; i < 5; i++) {
                String[] line = list.get(i).split("\t");
                System.out.printf("%-10s",line[2]);
            }
            for (int i = 0; i < 5; i++) {
                String[] line = list.get(i).split("\t");
                System.out.printf("%-10s",line[1]);
            }
            System.out.println();

        }
    }
}
