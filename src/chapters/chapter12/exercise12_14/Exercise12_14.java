package chapters.chapter12.exercise12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file's path : ");
        String path = input.nextLine();

        File file = new File(path);
        int sum = 0 ;
        try(
                Scanner scan = new Scanner(file)
        ){
            while (scan.hasNext()){
                sum += scan.nextInt();

            }
        }

        System.out.println("Sum of scores is : " + sum);
    }
}
