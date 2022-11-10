package chapters.chapter8;

public class Exercise08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        fillThisMatrixWithRandom0s1s(matrix);
        printArray(matrix);

        displayRowsHavingEven1s(matrix);
        displayColsHavingEven1s(matrix);

    }

    private static void displayColsHavingEven1s(int[][] matrix) {
        System.out.println("Even cols are : ");
        for (int col = 0; col < matrix[0].length ; col++) {

            int sum = 0 ;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            if(sum % 2 == 0 ){
                System.out.print( col  +" , ");
            }
        }
        System.out.println();
    }

    private static void displayRowsHavingEven1s(int[][] matrix) {
        System.out.println("Even rows are : ");
        for (int row = 0; row < matrix.length; row++) {
            int sum  = 0 ;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            if(sum % 2 == 0 ){
                System.out.print( row  +" , ");
            }
        }
        System.out.println();

    }

    public static void fillThisMatrixWithRandom0s1s(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] =(int) (Math.random() * 2);
            }
        }
    }

    public static void printArray(int[][] chars) {
        for (int row = 0; row < chars.length; row++) {
            for (int col = 0; col < chars[row].length; col++) {
                System.out.print(chars[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
