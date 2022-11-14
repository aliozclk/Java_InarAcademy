package chapters.chapter10.exercise10_14;

import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public  MyDate(){
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(int year,int month, int day ){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar ac = new  GregorianCalendar();
        ac.setTimeInMillis(elapsedTime);
        year = ac.get(GregorianCalendar.YEAR);
        month = ac.get(GregorianCalendar.MONTH);
        day = ac.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return "Created Date : " +
                "year=" + year +
                ", month=" + month +
                ", day=" + day ;
    }
}
