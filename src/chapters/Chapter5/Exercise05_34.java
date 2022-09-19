package chapters.Chapter5;

import java.util.Scanner;

public class Exercise05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int pcWon = 0 ;
        int userWon = 0 ;

        do {
            System.out.println("scissor (0), rock (1), paper (2): ");
            int user = input.nextInt();

            int pc = (int)(Math.random() *3 );

            if (user == 0 && pc == 1) {
                System.out.println("The computer is rock. You are scissor . You lose.");
                pcWon++;
            }
            if (user == 0 && pc == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
            }
            if (user == 0 && pc == 2) {
                System.out.println("The computer is paper. You are scissor. You win.");
                userWon++;
            }
            if (user == 1 && pc == 0) {
                System.out.println("The computer is scissor. You are rock . You win.");
                userWon++;
            }
            if (user == 1 && pc == 1) {
                System.out.println("The computer is rock. You are rock. It is a draw");
            }
            if (user == 0 && pc == 2) {
                System.out.println("The computer is paper. You are rock. You lose.");
                pcWon++;
            }
            if (user == 2 && pc == 1) {
                System.out.println("The computer is paper. You are rock . You win.");
                userWon++;
            }
            if (user == 2 && pc == 2) {
                System.out.println("The computer is rock. You are rock too. It is a draw");
            }
            if (user == 2 && pc == 0) {
                System.out.println("The computer is scissor. You are paper. You lose.");
                pcWon++;
            }
            System.out.println("Score" + userWon +" - " + pcWon);
        }while (Math.abs(userWon-pcWon) < 2  );

        if (userWon > pcWon ){
            System.out.println("you won this game.");
        }else {
            System.out.println("you lose this game");
        }


    }
}
