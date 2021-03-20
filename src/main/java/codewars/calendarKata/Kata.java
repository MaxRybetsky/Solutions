package codewars.calendarKata;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Kata {
    public static String[] mostFrequentDays(int year) {
        LocalDate date = LocalDate.of(year, Month.JANUARY, 1);
        if (!date.isLeapYear()) {
            return new String[]{firstLetterUp(date.getDayOfWeek())};
        }
        String[] result = new String[2];
        DayOfWeek firstDay = date.getDayOfWeek();
        if(firstDay == DayOfWeek.SUNDAY) {
            return new String[] {"Monday", "Sunday"};
        }
        return new String[]{
                        firstLetterUp(firstDay),
                        firstLetterUp(firstDay.plus(1))}
                ;
    }

    private static String firstLetterUp(DayOfWeek dayOfWeek) {
        String day = dayOfWeek.toString();
        return day.charAt(0) + day.substring(1).toLowerCase();
    }
}
