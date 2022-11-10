package chapters.chapter6;

public class Exercise06_24 {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;

        int totalYears = (int) (totalDays / 365);
        int currentYear = totalYears + 1970;

        totalDays = (totalDays - (totalLeaps(currentYear))) % 365;


        int currentMonth = daysInMonth(currentYear, (int) totalDays);
        String currentMonthName = getMonthName(currentMonth);
        int numberOfDaysInCurrentMonth = (int)totalDays - getNumberOfDaysTillCurrentMonth(currentYear,currentMonth);
        int startDay = getFirstDay(currentYear,currentMonth);
        String currentDayName = getDayName((startDay + numberOfDaysInCurrentMonth ) % 7);
        System.out.print(getMonthName(currentMonth) + " " + numberOfDaysInCurrentMonth + ", " +
                currentYear + " " + currentDayName);
        System.out.print(" " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
    public static int totalLeaps(int year) {
        int leaps = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)) {
                leaps++;
            }
        }
        return leaps;
    }

    public static int daysInMonth(int year, int days) {
        int dayCount = 0;
        for (int i = 1; i <= 12; i++) {
            dayCount += howManyDaysInMonth(year, i);
            if (dayCount > days)
                return i;
        }
        return 12;
    }
    public static String getMonthName(int month) {
        String currentMonthName = "";
        switch (month) {
            case 1: currentMonthName = "January"; break;
            case 2: currentMonthName = "February"; break;
            case 3: currentMonthName = "March"; break;
            case 4: currentMonthName = "April"; break;
            case 5: currentMonthName = "May"; break;
            case 6: currentMonthName = "June"; break;
            case 7: currentMonthName = "July"; break;
            case 8: currentMonthName = "August"; break;
            case 9: currentMonthName = "September"; break;
            case 10: currentMonthName = "October"; break;
            case 11: currentMonthName = "November"; break;
            case 12: currentMonthName = "December";
        }
        return currentMonthName;
    }
    public static String getDayName(int number) {
        String currentDayName = "";
        switch (number) {
            case 0: currentDayName = "Sunday"; break;
            case 1: currentDayName = "Monday"; break;
            case 2: currentDayName = "Tuesday"; break;
            case 3: currentDayName = "Wednesday"; break;
            case 4: currentDayName = "Thursday"; break;
            case 5: currentDayName = "Friday"; break;
            case 6: currentDayName = "Saturday"; break;
        }
        return currentDayName;
    }
    public static int getFirstDay(int year, int month) {
        final int FIRST_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year,month);

        return (totalNumberOfDays + FIRST_DAY_FOR_JAN_1_1800) % 7;
    }
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }
        for (int i = 1; i < month; i++)
            total += howManyDaysInMonth(year, i);
        return total;
    }
    public static int getNumberOfDaysTillCurrentMonth(int year, int month) {
        int dayCount = 0;
        for (int i = 1; i < month; i++) {
            dayCount += howManyDaysInMonth(year,i);
        }
        return dayCount;

    }
    public static boolean isLeapYear(int year){

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int howManyDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0; //if month is incorrect
    }




}