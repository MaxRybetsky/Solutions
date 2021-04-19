package codewars.timeConverter;

public class TimeConverter {
    public static String toTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        return String.format("%d hour(s) and %d minute(s)", hours, minutes);
    }
}
