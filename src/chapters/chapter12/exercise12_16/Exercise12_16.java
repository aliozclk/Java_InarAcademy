package chapters.chapter12.exercise12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\text.txt");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        if (args.length != 3) {
            throw new IllegalArgumentException();
        }
        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            String s1 = scan.nextLine();
            list.add(s1.replaceAll(args[1], args[2]));
        }
        scan.close();

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < list.size(); i++) {
            output.println(list.get(i));
        }
        output.close();
        System.out.println(file.getAbsolutePath());
    }

}
