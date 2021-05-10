package expressionsstatementscodeblocksmethods;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            String hoursString = String.valueOf(hours);
            String minutesString = String.valueOf(remainingMinutes);
            String secondsString = String.valueOf(seconds);
            if (hours < 10) {
                hoursString = 0 + hoursString;
            }
            if (remainingMinutes < 10) {
                minutesString = 0 + minutesString;
            }
            if (seconds < 10) {
                secondsString = 0 + secondsString;
            }

            return hoursString + "h " + minutesString + "m " + secondsString + "s";
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
