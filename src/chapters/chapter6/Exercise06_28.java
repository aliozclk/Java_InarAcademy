package chapters.chapter6;

public class Exercise06_28 {
    public static void main(String[] args) {

        System.out.println("p\t\t\t\t2^p –1");
        System.out.println("_______________________");

        for (int p = 2 ; p <= 31 ; p ++ ){
            System.out.println(p + "\t\t\t\t" + mersenne(p));
        }
    }

    public static int mersenne(int num){

        return (int) Math.pow(2,num) - 1 ;
    }
}
