package chapters.chapter12.exercise12_33;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_33 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String url = "https://www.udemy.com/?utm_source=adwords-brand&utm_medium=udemyads&utm_campaign=NEW-AW-PROS-Branded-Search-TR-TUR_._ci__._sl_TUR_._vi__._sd_All_._la_TR_._&tabei=7&utm_term=_._ag_55807532837_._ad_290966506993_._de_c_._dm__._pl__._ti_kwd-296956216253_._li_1012763_._pd__._&gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkr9FEQdxYBjYk117JID4Y5JD1MOopbAmmxKgDfeR9zq2DoaJLuAxooaAi22EALw_wcB";
        crawler(url); // Traverse the Web from a starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s: getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }
                    else
                        current = -1;
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
