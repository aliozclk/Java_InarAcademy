package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number n: ");
        int size = input.nextInt();
        input.nextLine();

        char[][] square = new char[size][size];
        System.out.println("Enter 4 rows of letters separated by spaces:");
        for (int i = 0; i < size; i++) {
            readThem(input, square, i);
            if(!controlLettersByRow(square, i , size)){
                break;
            }

        }

        if (isLatinSquare(square)) {
            System.out.println("The input array is a Latin square.");
        }
    }

    public static boolean isLatinSquare(char[][] square) {
        if (!rowMistakeControl(square)){
            return false;
        }
        if(!colMistakeControl(square)){
            return false;
        }

        return true;
    }

    public static boolean rowMistakeControl(char[][] square) {
        for (int row = 0; row < square.length; row++) {
            boolean[] control = new boolean[square.length];
            for (int col = 0; col < square[row].length; col++) {
                control[square[row][col] - 'A'] = true;
            }
            if(isThereAFlaw(control)){
                return true;
            }
        }
        return false;
    }

    public static boolean colMistakeControl(char[][] square) {
        for (int col = 0; col < square[0].length; col++) {
            boolean[] control = new boolean[square.length];
            for (int row = 0; row < square.length; row++) {
                control[square[row][col] - 'A'] = true;
            }
            if(isThereAFlaw(control)){
                return true;
            }
        }
        return false;
    }

    private static boolean isThereAFlaw(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    }

    public static void readThem( Scanner input,char[][] arr, int row) {
        String rowString = input.nextLine();
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = rowString.charAt(col * 2);
        }

    }

    public static boolean controlLettersByRow(char[][] arr , int row , int size){
        for (int col = 0; col < size; col++) {
            if(!(arr[row][col] < 'A' + size )){
                System.out.println("Wrong input: the letters must be from A to " + (char)('A' + (size - 1 )));
                System.exit(1);
            }
        }
        return true;
    }
}
