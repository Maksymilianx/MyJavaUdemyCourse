package sectionNr4.Exercises;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid value");
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h= " + milesPerHour + "mi/h");
        }
    }

    public static void main(String[] args) {
        // if function does not print line in return, we have to do it later in void main function
        System.out.println("Miles = " + toMilesPerHour(10.5));
        printConversion(10.5);
    }
}
