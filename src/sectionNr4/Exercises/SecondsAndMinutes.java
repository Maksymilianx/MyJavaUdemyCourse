package sectionNr4.Exercises;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    private static String getDurationString(int minutes,int seconds) {
        if ((minutes < 0) || (seconds > 59) || (seconds < 0)){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int minutess = minutes % 60;

        String hoursString = hours + "h ";
        String minutesString = minutess + "m ";
        String secondsString = seconds + "s";

        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        if (minutess < 10) {
            minutesString = "0" + minutesString;
        }
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString  + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        int minutes = seconds / 60;
        int remainingSeconde = seconds % 60;

        return getDurationString(minutes, remainingSeconde);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(95, 55));
        System.out.println(getDurationString(-321451));
    }
}
