package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students : ");
        int size = input.nextInt();
        input.nextLine();

        String[] studentNames = new String[size];
        int[] studentScores = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("Enter student name : ");
            studentNames[i] = input.nextLine();
            System.out.println("Enter student score : ");
            studentScores[i] = input.nextInt();
            input.nextLine();
        }

        putThemInDecreasingOrder(studentNames,studentScores);

        printArray(studentNames,studentScores);



    }

    public static void putThemInDecreasingOrder(String[] names, int[] scores ){


        for (int i = 0; i < scores.length - 1; i++) {
            int max = scores[i] ;
            int maxIndex = i ;

            for (int j = i+1 ; j < scores.length ; j++) {
                if(max < scores[j]){
                    max = scores[j];
                    maxIndex = j ;
                }

            }

            if(maxIndex != i){
                scores[maxIndex] = scores[i];
                scores[i] = max ;
                String temp = names[maxIndex];
                names[maxIndex] = names[i];
                names[i] = temp ;
            }

        }
    }

    public static void printArray(String[] names, int[] scores ){
        for (int i = 0; i < scores.length ; i++) {

                System.out.print("Name: " +names[i] + " score : " + scores[i]);

                System.out.println();
            }
    }
}
