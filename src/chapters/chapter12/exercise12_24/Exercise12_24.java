package chapters.chapter12.exercise12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_24\\Salary.txt");

        PrintWriter pw = new PrintWriter(file);

        final int numberOfLines = 1_000;
        String[] rank = {"assistant", "associate","full"};

        for (int i = 0; i < numberOfLines ; i++) {
            String line = "FirstName" + i + " LastName" + i ;
            int rankIndex = new Random().nextInt(rank.length);
            line += " " + rank[rankIndex];
            if(rankIndex == 0){
                line += " " + ( 50_000 + (new Random().nextInt(30_000)));
            } else if (rankIndex == 1) {
                line += " " + ( 60_000 + (new Random().nextInt(50_000)));
            } else if (rankIndex == 2) {
                line += " " + ( 75_000 + (new Random().nextInt(55_000)));
            }

            line += "." + new Random().nextInt(100)  ;
            pw.println(line);


        }

        pw.close();
    }
}
