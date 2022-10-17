package chapters.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"program","voyage","induce","fulfill","impoverished","longevity"};
        String choice = "";
        do {
            int mistakes = 0 ;
            int randomIndex = (int)(Math.random() * words.length);

            String question = words[randomIndex];
            char[] answer = getStringWithAsteriks(question);
            do {

                System.out.print("(Guess) Enter a letter in word ");
                printArray(answer);
                String nextGuess = input.nextLine();
                mistakes = putTheGuessOnAnswer(question,answer,nextGuess , mistakes);

            }while (!IsWholeWordDısplayed(answer));

            System.out.println("The word is " + question + ".You missed " + mistakes +  " time");
            System.out.println("Do you want to guess another word? Enter y or n: ");
            choice = input.nextLine();
        }while (choice.charAt(0) == 'y');
    }

    public static char[] getStringWithAsteriks(String question) {
         char[] ans = new char[question.length()];
        for (int i = 0; i < question.length(); i++) {
            ans[i] = '*';
        }
        return ans;
    }

    public static int putTheGuessOnAnswer(String question , char[] answer , String guess , int mistakes){
        String ans = Arrays.toString(answer);
        if(ans.contains(guess)){
            System.out.println(guess + " is already in the word ");
        }else if (question.contains(guess)){
            char ch = guess.charAt(0);
            for (int i = 0; i < question.length(); i++) {
                if (question.charAt(i) == ch ){
                    answer[i] = ch ;
                }
            }
        }else {
            System.out.println(guess + "  is not in the word");
            mistakes++;
        }
        return mistakes;
    }

    public static void printArray(char[] array ){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean IsWholeWordDısplayed(char[] answer){
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] == '*'){
                return false;
            }
        }
        return true;
    }
}
