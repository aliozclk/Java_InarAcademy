package chapters.Chapter6;

import java.util.Scanner;

public class Exercise06_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int num = input.nextInt();

        displayPattern(num);

    }

    public static void displayPattern(int n){

        for (int i = 1 ; i <= n ; i++){
            for (int j = 0 ; j < (n-i) * 2 ; j++){
                System.out.print(" ");
            }
            for (int t = i ; t > 0 ; t--){
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
