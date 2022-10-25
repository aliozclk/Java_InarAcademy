package chapters.Chapter8;

import java.util.Scanner;

public class Exercise08_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] board = new char[6][7];
        fillThisArrayWithBlank(board);
        printArray(board);
        boolean[] status = new boolean[3];
        boolean isFinished = false ;
        int count = 0 ;

        while (!isFinished){

            if (count % 2 == 0){
                promptAndReadRed(board ,input);
            }else {
                promptAndReadYellow(board,input);
            }
            printArray(board);
            isFinished = statusControl(status,board);
            count++;
        }

        if(status[0]){
            System.out.println("Red player wins.");

        }
        if(status[1]){
            System.out.println("Yellow player wins.");

        }
        if(status[2]){
            System.out.println("It's a draw.");

        }

    }

    public static void fillThisArrayWithBlank(char[][] board){
        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

    }
    public static void printArray(char[][] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].length; col++) {
                System.out.print( " | " + chars[row][col]);
            }
            System.out.println("|");
        }
    }

    public static void promptAndReadRed(char[][] board ,Scanner input){
        System.out.println("Drop a red disk at column (0–6): ");
        int col = input.nextInt();
        placeTheDisk(board,col,'R');
    }
    public static void promptAndReadYellow(char[][] board ,Scanner input){
        System.out.println("Drop a yellow disk at column (0–6): ");
        int col = input.nextInt();
        placeTheDisk(board,col,'Y');
    }

    public static void placeTheDisk(char[][] board , int col , char ch){
        for (int row = 5; row >= 0  ; row--) {
            if(board[row][col] == ' '){
                board[row][col] = ch;
                break;
            }
        }
    }

    public static boolean statusControl(boolean[] status , char[][] board){
        for(int row = board.length -1 ; row >= 0 ; row-- ){
            for (int col = board[row].length - 1; col >= 0 ; col--) {
                char ch = board[row][col] ;

                if( ch == ' ' ){
                    status[2] = false;
                    continue;
                }
                if(row - 3  >= 0 ){
                    int count = 1 ;
                    for (int i = 1; i < 4 ; i++) {
                        if(upwardsControl(board,row,col,i)){
                            count++;
                        }
                    }
                    if (count == 4){
                        printResult(ch);
                        return true;
                    }
                }
                if (col - 3 >= 0) {
                    int count = 1 ;
                    for (int i = 1; i < 4 ; i++) {
                        if(leftwardsControl(board,row,col,i)){
                            count++;
                        }
                    }
                    if (count == 4){
                        printResult(ch);
                        return true;
                    }
                }
                if (row - 3 >= 0 && col - 3 >= 0) {
                    int count = 1 ;
                    for (int i = 1; i < 4; i++) {
                        if (leftDiagonalControl(board, row, col, i)) {
                            count++;
                        }
                    }
                    if (count == 4){
                        printResult(ch);
                        return true;
                    }
                }
                if (col + 3 < board[row].length && row - 3 >= 0) {
                    int count = 1 ;
                    for (int i = 1; i < 4; i++) {
                        if (rightDiagonalControl(board, row, col, i)) {
                            count++;
                        }
                    }
                    if (count == 4){
                        printResult(ch);
                        return true;
                    }
                }



            }
        }
        return false;
    }

    public static void printResult(char ch) {
        if(ch == 'Y'){
            System.out.println("The yellow player won.");
        }else {
            System.out.println("The red player won.");
        }
    }

    public static boolean leftwardsControl(char[][] values , int row , int col , int i){
        if(values[row][col] == values[row][col-i]){
            return true;
        }
        return false;
    }
    public static boolean upwardsControl(char[][] values , int row , int col , int i){
        if(values[row][col] == values[row - i][col]){
            return true;
        }
        return false;
    }
    public static boolean leftDiagonalControl(char[][] values , int row , int col , int i){
        if(values[row][col] == values[row - i][col - i]){
            return true;
        }
        return false;
    }

    public static boolean rightDiagonalControl(char[][] values , int row , int col , int i){
        if(values[row][col] == values[row - i][col + i]){
            return true;
        }
        return false;
    }

}
