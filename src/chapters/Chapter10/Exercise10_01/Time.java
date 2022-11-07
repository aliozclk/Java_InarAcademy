package chapters.Chapter10.Exercise10_01;

import java.util.Date;

public class Time {
    private long hour;
    private long minute;
    private long second;

    Time(){
        this(System.currentTimeMillis());
    }
    Time(long elapsedTime){
        setTime(elapsedTime);
    }
    Time(long hour, long minute , long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        Date elapsedDate = new Date(elapseTime);
        second = elapsedDate.getSeconds();
        minute = elapsedDate.getMinutes() ;
        hour = elapsedDate.getHours() ;
    }
}
