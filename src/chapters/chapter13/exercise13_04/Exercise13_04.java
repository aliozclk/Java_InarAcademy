package chapters.chapter13.exercise13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise13_04 {
    public static void main(String[] args) {
        if(args.length != 2){
            throw new IllegalArgumentException("Illegal Argument...");
        }

        Integer month = Integer.valueOf(args[0]) - 1;
        Integer year = Integer.valueOf(args[1]);

        Calendar calendar = new GregorianCalendar(year,
                month, 1);

        printTitle(calendar);

        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.printf("%4s", " ");
        }


        int lastDay = calendar.getActualMaximum(Calendar.DATE);

        while (calendar.get(Calendar.DATE) < lastDay){
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.printf("%4d\n", calendar.get(Calendar.DATE));
            }else{
                System.out.printf("%4d", calendar.get(Calendar.DATE));
            }
            calendar.add(Calendar.DATE, 1);
        }

        System.out.printf("%4d\n", calendar.get(Calendar.DATE));

    }
    public static void printTitle(Calendar calendar) {

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.printf("%18s\n", months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
}
