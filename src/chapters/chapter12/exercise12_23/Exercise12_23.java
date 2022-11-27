package chapters.chapter12.exercise12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        File scores = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_23\\scores.txt");

        if(!scores.exists()){
            throw new FileNotFoundException("File doesn't exist...");
        }
        int sum = 0;
        int count = 0;

        try(
                Scanner scan = new Scanner(scores);
                ){
            while (scan.hasNext()){
                sum += scan.nextInt();
                count++;
            }
        }

        System.out.println("Total score : " + sum +
                "\nAverage score : " + sum/count);

    }
}
