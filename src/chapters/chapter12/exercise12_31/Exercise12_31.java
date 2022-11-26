package chapters.chapter12.exercise12_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_31\\babynameranking"+year+".txt");

        System.out.println("Enter the gender: ");
        String gender = input.next();

        System.out.println("Enter the name:");
        String name = input.next();
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner scan = new Scanner(file);

                ) {
            while (scan.hasNext()){

                list.add(scan.nextLine());
            }
        }

        System.out.println(name + " is ranked #" + searchNamesInText(list,gender,name) + " in year " + year );

    }

    public static String searchNamesInText(ArrayList<String> list,String gender,String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(name)) {
                String[] line = list.get(i).split("\t");
                if (gender.equals("M") && line[1].equals(name)) {
                    return line[0];
                } else if (line[2].equals(name)) {
                    return line[0];
                }
            }


        }
        return "There's no match.";
    }
}
