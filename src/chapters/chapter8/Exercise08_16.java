package chapters.chapter8;

public class Exercise08_16 {
    public static void main(String[] args) {


        int[][] numbers ={{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(numbers);
        printArray(numbers);




    }


    public static void sort(int m[][]) {

        for (int i = 0; i < m.length - 1; i++) {

            int[] temp = new int[m.length];
            for (int row = 0 ; row < m.length - i - 1; row++) {
                if (m[row][0] > m[row + 1][0]) {
                    temp = m[row];
                    m[row] = m[row + 1];
                    m[row+1] = temp ;

                } else if (m[row][0] == m[row+1][0]  ) {
                    if(m[row][1] > m[row + 1][1]){
                        temp = m[row];
                        m[row] = m[row + 1];
                        m[row+1] = temp ;
                    }
                }

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
