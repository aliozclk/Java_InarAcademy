package chapters.Chapter6;

public class Exercise06_24 {
    public static void main(String[] args) {

        int year = getYear();
        System.out.println(year);

    }

    public static int getYear(){
        long totalMilliseconds = System.currentTimeMillis();

        long calculatedMilliSec = 0;
        int count = 1970;

        while ( calculatedMilliSec <= totalMilliseconds ) {

            if(isLeapYear(count)){
                calculatedMilliSec += 366 * 24 * 60 * 60 * 1000 ;
            }
            else {
                calculatedMilliSec += 365 * 24 * 60 * 60 * 1000 ;
            }
            count++;

        }
        return count;



    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    //public static int day(int year){

    //}



}
