package chapters.chapter10.exercise10_01;

public class TestTime {
    public static void main(String[] args) {
        Time a = new Time();

        System.out.println("1: Using new Time()" );
        System.out.println("Hour : " + a.getHour() + "-- Minute : " + a.getMinute() + "-- Second :"+ a.getSecond());

        Time b = new Time(555550000);
        System.out.println("2: Using new Time(555550000)" );
        System.out.println("Hour : " + b.getHour() + "-- Minute : " + b.getMinute() + "-- Second :"+ b.getSecond());


    }
}
