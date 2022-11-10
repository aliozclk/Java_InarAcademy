package chapters.chapter8;

public class Exercise08_10 {
    /*(Largest row and column) Write a program that randomly fills in 0s and 1s into
    a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
    most 1s. Here is a sample run of the program:
            0011
            0011
            1101
            1010
    The largest row index: 2
    The largest column index: 2*/

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        fillThisArrayWithRandom1or0(matrix);

        printArray(matrix);

        int largestRow = getLargestRow(matrix);
        int largestCol = getLargestCol(matrix);

        System.out.println("The largest row index: " + largestRow);
        System.out.println(" The largest column index: " + largestCol);
    }

    private static void fillThisArrayWithRandom1or0(int[][] matrix) {
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
    }

    private static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(" " + matrix[row][col] + " | ");
            }
            System.out.println();
        }
    }

    private static int getLargestRow(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int row = 0; row < matrix[0].length; row++) {
            int sum = 0 ;
            for (int col = 0; col < matrix.length ;col++) {
                sum += matrix[row][col];

            }
            if (sum > max){
                max = sum ;
                maxIndex = row ;
            }
        }
        return maxIndex;
    }

    public static int getLargestCol(int[][] matrix) {

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0 ;
            for (int row = 0; row < matrix.length ;row++) {
                sum += matrix[row][col];

            }
            if (sum > max){
                max = sum ;
                maxIndex = col ;
            }
        }
        return maxIndex;
    }

}
