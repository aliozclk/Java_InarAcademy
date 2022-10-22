package chapters.Chapter8;

import java.util.Objects;
import java.util.Scanner;

public class Exercise08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];
        fillThisStringWıthBlanks(board);
        int count = 0 ;
        String status = "It's a draw.";

        do {
            printBoard(board);
            readXplayer(input, board);
            printBoard(board);
            count++;
            if (count == 9){
                break;
            }

            status = getStatusX(board);
            if(status != "It's a draw." ){
                break;
            }

            printBoard(board);
            readOPlayer(input, board);
            printBoard(board);
            count++;

            status = getStatusO(board);
            if(status != "It's a draw." ){
                break;
            }




        }while (count < 9);

        System.out.println(status);


    }

    public static String getStatusO(char[][] board){
        if (isTheWinnerO(board)) {
            return "O player won.";
        }else {
            return "It's a draw.";
        }
    }

    public static String getStatusX(char[][] board) {
       if (isTheWinnerX(board)) {
           return "X player won.";
       }else {
           return "It's a draw.";
       }
    }

    public static boolean isTheWinnerO(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(isRowControlSuccesful(arr, i , 'O')){
                return true;
            } else if (isColControlSuccesful(arr,i,'O')) {
                return true;
            } else if (isDiagonalControl(arr,i , 'O')) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalControl(char[][] arr, int i, char xox) {
        int row = i ;
        int count = 0 ;
        for (int col = 0; col < arr[row].length; col++) {
            if(arr[col][col] == xox){
                count++;
            }
        }
        if(count == 3 ){
            return true;
        } else {
            if (arr[0][2] == xox &&  arr[1][1] == xox && arr[2][0] == xox){
                return true;
            }
        }
        return false;
    }

    private static boolean isColControlSuccesful(char[][] arr, int i, char xox) {
        int col = i ;
        int count = 0 ;
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][col] == xox){
                count++;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
    }

    private static boolean isRowControlSuccesful(char[][] arr, int i, char xox) {
        int row = i ;
        int count = 0 ;
        for (int col = 0; col < arr[i].length; col++) {
            if(arr[row][col] == xox ){
                count++;
            }
        }
        if (count != 3 ){
            return false;
        }
        return true;

    }

    private static boolean isTheWinnerX(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(isRowControlSuccesful(arr, i , 'X')){
                return true;
            } else if (isColControlSuccesful(arr,i,'X')) {
                return true;
            } else if (isDiagonalControl(arr,i , 'X')) {
                return true;
            }
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            System.out.println("________________________");
            for (int col = 0; col < board.length; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
        }

        System.out.println("_______________________");
    }

    public static void fillThisStringWıthBlanks(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';

            }
        }
    }

    public static void readOPlayer(Scanner input, char[][] board) {
        System.out.println("Enter a row (0, 1, or 2) for player O:");
        int row = input.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player O:");
        int col = input.nextInt();
        board[row][col] = 'O';
    }

    public static void readXplayer(Scanner input, char[][] board) {
        System.out.println("Enter a row (0, 1, or 2) for player X:");
        int row = input.nextInt();
        System.out.println("Enter a column (0, 1, or 2) for player X:");
        int col = input.nextInt();
        board[row][col] = 'X';
    }
}
