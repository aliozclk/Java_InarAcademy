package chapters.chapter12.exercise12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) {

        String str = "https://www.lipsum.com/feed/html";

        try{
            URL url = new URL(str);
            int wordCount = 0;
            Scanner scan = new Scanner(url.openStream());
            while (scan.hasNext()){
                scan.next();
                wordCount++;
            }
            System.out.println("Number of words : " + wordCount);
        }
        catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (IOException e){
            System.out.println("I/O errors : no such file");
        }

    }
}
