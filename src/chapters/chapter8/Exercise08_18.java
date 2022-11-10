package chapters.chapter8;

public class Exercise08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);
        printArray(m);


    }

    public static void shuffle(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            int newRow = (int) (Math.random() * m.length);

            for (int col = 0; col < m[row].length; col++) {
                int newCol = (int) (Math.random() * m[row].length);
                int temp = m[row][col];
                m[row][col] = m[newRow][newCol];
                m[newRow][newCol] = temp;
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
