package chapters.Chapter6;

public class Exercise06_25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(System.currentTimeMillis()));

    }
    public static String convertMillis(long millis){
        String time = "";


        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        time = ":" + Long.toString(currentSecond);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        time = ":" + Long.toString(currentMinute) + time;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        time = Long.toString(currentHour) + time ;

        return time;

    }
}
