package chapters.Chapter6;

public class Exercise06_24 {
    public static void main(String[] args) {

        int year = getYear();
        System.out.println(year);

    }

    public static int getYear(){
        long totalMilliseconds = System.currentTimeMillis();

        long milliSecPerYear = (long) (3.1556926 * Math.pow(10,10));
        int count = 1970;

        return (int)(totalMilliseconds / milliSecPerYear) + 1970 ;


    }


    public static boolean isLeapYear(int year){

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
   // public static int month()

    //public static int day(int year){

    //}



}
