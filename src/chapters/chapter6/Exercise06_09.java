package chapters.chapter6;

public class Exercise06_09 {
    public static void main(String[] args) {

        System.out.println("Feet\t\tMeter\t\t|\t\tMeters\t\tFeet");
        System.out.println("________________________________________________");

        for (double f = 1 , m = 20 ; f <= 10.0 ; f += 1.0 , m += 5.0 ){
            System.out.printf("%4.1f\t\t%-5.3f\t\t|\t\t%-5.1f\t\t%7.3f\n", f, footToMeter(f),
                    m,meterToFoot(m));
        }
    }

    public static double footToMeter(double foot){
       return  0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
