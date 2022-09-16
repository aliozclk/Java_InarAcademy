package chapters.Chapter5;

public class Exercise05_40 {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0 ;
        for (int i = 0 ; i < 1_000_000 ; i++ ) {
            int coin = (int) (Math.random() * 2);

            if (coin == 0) {
                head++;
            }else {
                tail++;
            }


        }
        System.out.println("Number of tails " + tail + " and heads " + head );

    }

}
