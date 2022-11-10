package chapters.chapter8;

import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of rows and columns ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] nums = new int[row][col];
        System.out.println("Enter values");

        readThem(nums, input);

        System.out.println();
        System.out.println(isConsecutiveFour(nums));

    }

    public static void readThem(int[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = input.nextInt();
            }
        }
    }

    public static boolean isConsecutiveFour(int[][] values) {
        for (int row = 0; row < values.length ; row++) {

            for (int col = 0; col < values[row].length; col++) {
                int count = 1 ;
                int value = values[row][col];
                if (col < values[row].length - 1 && value == values[row][col + 1]) {
                        for (int i = 1; col +i < values[row].length; i++) {
                            if (rightwardsControl(values, row, col, i)) {
                                count++;
                            } else {
                                break;
                            }
                    }
                }
                if ( row < values.length - 1 && value == values[row+1][col]) {
                    for (int i = 1; row + i < values.length ; i++) {
                        if(downwardsControl(values,row,col,i)){
                            count++;
                        }else {
                            break;
                        }
                    }
                } else if ( row < values.length - 1 && col < values[row].length - 1 && value == values[row + 1][col + 1]) {
                    for (int i = 1; row + i < values.length && col + i < values[row].length ; i++) {
                        if(diagonallyControl(values,row,col,i)){
                            count++;
                        }else {
                            break;
                        }
                    }
                } else if (row < values.length - 1 && col != 0 && value == values[row +1][col - 1]) {
                    for (int i = 1; row + i < values.length && col - i > 0; i++) {
                        if(oppositeDiagonallyControl(values,row,col,i)){
                            count++;
                        }else {
                            break;
                        }
                    }

                }
                if(count == 4){
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean rightwardsControl(int[][] values , int row , int col , int i){
       if(values[row][col] == values[row][col+i]){
           return true;
       }
       return false;
    }
    public static boolean downwardsControl(int[][] values , int row , int col , int i){
        if(values[row][col] == values[row + i][col]){
            return true;
        }
        return false;
    }
    public static boolean diagonallyControl(int[][] values , int row , int col , int i){
        if(values[row][col] == values[row + i][col + i]){
            return true;
        }
        return false;
    }

    public static boolean oppositeDiagonallyControl(int[][] values , int row , int col , int i){
        if(values[row][col] == values[row + i][col - i]){
            return true;
        }
        return false;
    }



}
