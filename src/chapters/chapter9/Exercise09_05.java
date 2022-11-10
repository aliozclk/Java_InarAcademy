package chapters.chapter9;

import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Date :" + gregorianCalendar.get(GregorianCalendar.YEAR) + " : " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " : "+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(1234567898765L);

        System.out.println("Date :" + gregorianCalendar.get(GregorianCalendar.YEAR) + " : " +
                gregorianCalendar.get(GregorianCalendar.MONTH) + " : "+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
