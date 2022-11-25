package chapters.chapter12.exercise12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class Exercise12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_15.txt");
        java.io.PrintWriter output = null;
            output = new java.io.PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            output.print(new Random().nextInt(100));
            output.print(" ");
        }
        output.close();
        System.out.println(file.getAbsolutePath());

    }
}
