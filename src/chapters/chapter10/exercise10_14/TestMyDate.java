package chapters.chapter10.exercise10_14;


import java.time.Year;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);

        System.out.println("Current Time: ");
        System.out.println("Year: " + myDate1.getYear() + " Month: " + myDate1.getMonth()  + " Year: " + myDate1.getDay());
        System.out.println("Elapsed Time (34355555133101)" );
        System.out.println("Year: " + myDate2.getYear() + " Month: " + myDate2.getMonth()  + " Day : " + myDate2.getDay());
    }
}
