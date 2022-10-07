package chapters.Chapter7;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        int[] scores= new int[numOfStudents];
        System.out.println("Enter "+ numOfStudents + " scores: ");
        readScores(input, scores);
        int best = bestScore(scores);
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + findGrade(best,scores[i]));

        }
    }
    public static void readScores(Scanner input, int[] scores) {
        for (int i = 0; i < scores.length ; i++) {
            scores[i]= input.nextInt();

        }
    }

    public static int bestScore(int[] array){
        int best = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > best){
                best = array[i];
            }
        }
        return best;
    }

    public static char findGrade(int best, int score){
        if(score >= best-10){
            return 'A';
        } else if (score >= best-20) {
            return 'B';
        } else if (score >= best-30) {
            return 'C';
            
        } else if (score >= best-40) {
            return 'D';
            
        }else {
            return 'F';
        }

    }

}
