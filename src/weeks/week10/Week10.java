package weeks.week10;

public class Week10 {
    public static void main(String[] args) {

        int[][] array = new int[3][4];
        int start = 18 ;
        int limit = 65 ;
        fill2DArrWithRandomValues(array , start , limit);
        printArray(array);
    }
    public static void fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int)(Math.random() * (limit - start)) + (start) ;
            }
        }
    }

    public static void printArray(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]  + " | ");
            }
            System.out.println();
        }
    }

}
