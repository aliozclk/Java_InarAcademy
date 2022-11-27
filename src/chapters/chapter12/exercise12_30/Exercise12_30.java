package chapters.chapter12.exercise12_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        File file = new File("C:\\Users\\alioz\\Desktop");
        System.out.println("Enter a filename : ");
        String filename = input.nextLine();

        int[] alphabet = new int[26];
        ArrayList<String> matchingFile = new ArrayList<>();

        searchDirectories(file,filename,matchingFile);

        file = new File(matchingFile.get(0));

        alphabeticalCounter(alphabet,file);

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("Number of " +(char)(i + 65) + "'s : "  + alphabet[i]);
        }

    }

    public static void searchDirectories(File file , String name, ArrayList<String> list) throws FileNotFoundException, IOException {
        if(file.isDirectory() && file.listFiles() != null){
            for (File f : file.listFiles()){
                searchDirectories(f,name,list);

            }

        } else if(file.getName().equals(name)){
            list.add(file.getAbsolutePath());
        }
    }

    public static void alphabeticalCounter(int[] chars , File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();

        while (scan.hasNext()){
            list.add(scan.nextLine());
        }
        scan.close();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                char ch = Character.toUpperCase(list.get(i).charAt(j));
                int index = (int)(ch) - 65;

                if(index < 26 && index >= 0){
                    chars[index]++;
                }
            }
        }

    }
}
