package chapters.chapter12.exercise12_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alioz\\Desktop\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\exercise12_24\\Salary.txt");
        ArrayList<String> list = new ArrayList<>();

        try(
                Scanner scan = new Scanner(file);
                ){
            while (scan.hasNext()){
                list.add(scan.nextLine());
            }
        }

        double totalSalaryForAssistants = 0;
        int numberOfAssistants = 0;
        double totalSalaryForAssociates = 0;
        int numberOfAssociates = 0;
        double totalSalaryForFulls = 0;
        int numberOfFulls = 0;

        for (int i = 0; i < list.size(); i++) {
            String[] line = list.get(i).split(" ");

            switch (line[2]){
                case "assistant" :
                    totalSalaryForAssistants += Double.parseDouble(line[3]);
                    numberOfAssistants++;
                    break;
                case "associate" :
                    totalSalaryForAssociates += Double.parseDouble(line[3]);
                    numberOfAssociates++;
                case "full" :
                    totalSalaryForFulls += Double.parseDouble(line[3]);
                    numberOfFulls++;
            }


        }

        System.out.printf("%s%.2f\n","Total salary of assistants : " , totalSalaryForAssistants);
        System.out.printf("%s%.2f\n","Average salary of assistans : " , totalSalaryForAssistants/numberOfAssistants);
        System.out.printf("%s%.2f\n","Total salary of associates : " , totalSalaryForAssociates);
        System.out.printf("%s%.2f\n","Average salary of associates : " , totalSalaryForAssociates/numberOfAssociates);
        System.out.printf("%s%.2f\n","Total salary of full : " , totalSalaryForFulls);
        System.out.printf("%s%.2f\n","Average salary of full : " , totalSalaryForFulls/numberOfFulls);
        double totalSalary = totalSalaryForAssistants + totalSalaryForFulls + totalSalaryForAssociates ;
        int numberOfPersonal = numberOfAssistants  + numberOfAssociates + numberOfFulls;

        System.out.printf("%s%.2f\n","Total salary of all faculty : " , totalSalary);
        System.out.printf("%s%.2f\n","Average salary of assistans : " , totalSalary/numberOfPersonal );
    }
}
