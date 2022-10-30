package chapters.Chapter7;

public class Exercise07_22 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        boolean[] board = new boolean[64];
        int[] positions = new int[8];

        int count = 0 ;

        int loopCount = 0 ;
        while (count < 8){
            int position = (int) (Math.random() * 64);
            if (isAvailableForQueen(position, board)){
                positions[count] = position;
                locateQueen(position,board);
                count++;
            }

            loopCount++;
            if (loopCount > 50){
                board = new boolean[64];
                positions = new int[8];
                count = 0 ;
                loopCount = 0 ;
            }

        }

        printArray(positions);

        long end = System.nanoTime();
        System.out.println("Time : " + (end - start));

    }

    public static boolean isAvailableForQueen(int pos , boolean[] array){

        return !array[pos];

    }

    public static void locateQueen(int pos , boolean[] array){
        array[pos] = true ;
        locateColumns(pos,array);
        locateLine(pos,array);
        locateDiagonal(pos,array);

    }
    public static void locateColumns(int pos, boolean[] array){
        int col = pos % 8 ;
        for (int i = 0 ; i < 8 ; i ++) {
            array[col] = true;
            col +=8;
        }
    }

    public static void locateLine(int pos , boolean[] array){
        int line = (pos/8) *8 ;
        for (int i = 0 ; i < 8 ; i++) {
            array[line] = true ;
            line++;
        }
    }

    public static void locateDiagonal(int pos,boolean[] array) {
        int line = pos / 8; // pos = 28 line = 3
        int col = pos % 8; // col = 4
        int temp = pos; // 28
        while (pos % 8 != 7){
            if(pos < 0){
                break;
            }
            array[pos] = true;

            pos -= 7;

        }
        pos = temp;
        while (pos % 8 != 0 ){
            if(pos > 63 ){
                break;
            }
            array[pos] = true;

            pos += 7;

        }
        pos = temp;

        while (pos % 8 != 0 ){
            if(pos < 0 ){
                break;
            }
            array[pos] = true;

            pos -= 9;

        }
        pos = temp;
        while (pos % 8 != 7){
            if(pos > 63){
                break;
            }
            array[pos] = true;

            pos += 9;

        }
    }
    public static void printArray(int[] array ) {
        for (int i = 0; i <= 56; i += 8) {
            for (int j = 0; j < 8; j++) {
                System.out.print("| ");
                for (int k = 0; k < array.length; k++) {
                    if (array[k] == (i + j)) {
                        System.out.print("Q");
                    }
                }
            }
            System.out.println("|");
        }
    }


}
