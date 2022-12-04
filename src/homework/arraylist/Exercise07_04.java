package homework.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>();

        System.out.println("Enter scores (the input ends with negative integer): ");
        int numberOfScores = readThem(scores, input);

        int sum = sumOfScores(scores);
        int average = averageScore(numberOfScores, sum);
        int belowAverageScores = counterOfBelowAverage(scores, average);
        int aboveOrEqualAverage = counterOfAboveAverage(scores, average);

        System.out.println("sum :" + sum + "\naverage : " + average +
                "\nbelow average scores  : " + belowAverageScores +
                "\nabove or equal scores : " + aboveOrEqualAverage);


    }

    public static int readThem(ArrayList<Integer> numbers, Scanner input) {
        int count = 0;
        int temp = input.nextInt();
        while (temp > 0) {
            numbers.add(temp);
            count++;
            temp = input.nextInt();

        }
        return count;
    }

    /*public static ArrayList listEdit(ArrayList list, int length ){
        ArrayList<Integer>
        for (int i = 0; i < editedArray.length ; i++) {
            editedArray[i] = list[i];
        }
        return editedArray;
    }
    */

    public static int sumOfScores(ArrayList score) {
        int sum = 0;
        for (int i = 0; i < score.size(); i++) {
            sum += (int) score.get(i);
        }
        return sum;
    }

    public static int averageScore(int length, int sum) {
        return sum / length;
    }

    public static int counterOfBelowAverage(ArrayList scores, int average) {
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if ((int) scores.get(i) < average) {
                count++;
            }
        }
        return count;
    }

    public static int counterOfAboveAverage(ArrayList scores, int average) {
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if ((int) scores.get(i) >= average) {
                count++;
            }
        }
        return count;
    }

}
