package chapters.chapter7;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];

        System.out.println("Enter scores (the input ends with negative integer): ");
        int numberOfScores = readThem(scores,input);
        scores = arrayEdit(scores,numberOfScores);

        int sum = sumOfScores(scores);
        int average = averageScore(numberOfScores, sum);
        int belowAverageScores = counterOfBelowAverage(scores, average);
        int aboveOrEqualAverage = counterOfAboveAverage(scores,average);

        System.out.println("sum :" + sum + "\naverage : " + average +
                "\nbelow average scores  : " + belowAverageScores +
                "\nabove or equal scores : " + aboveOrEqualAverage );



    }

    public static int readThem(int[] numbers,Scanner input ) {
        int count = 0 ;
        for (int i = 0; i < numbers.length ; i++) {
           int temp = input.nextInt();
            if(temp < 0 ){
                break;
            }else {
                numbers[i] = temp;
                count++;

            }
        }
        return count;
    }

    public static int[] arrayEdit(int[] array, int length ){
        int[] editedArray = new int[length];
        for (int i = 0; i < editedArray.length ; i++) {
            editedArray[i] = array[i];
        }
        return editedArray;
    }
    public static int sumOfScores(int[] score){
        int sum = 0 ;
        for (int i = 0; i <score.length ; i++) {
            sum += score[i];
        }
        return sum;
    }
    public static int averageScore(int length, int sum){
        return sum/ length ;
    }

    public static int counterOfBelowAverage(int[] scores, int average){
        int count = 0 ;
        for (int i = 0; i < scores.length ; i++) {
            if( scores[i] < average ){
                count++;
            }
        }
        return count;
    }

    public static int counterOfAboveAverage(int[] scores, int average){
        int count = 0 ;
        for (int i = 0; i < scores.length ; i++) {
            if( scores[i] >= average ){
                count++;
            }
        }
        return count;
    }

}
