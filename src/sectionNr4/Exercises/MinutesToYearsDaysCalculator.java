package sectionNr4.Exercises;

import java.text.BreakIterator;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        long years = minutes / 525600;
        long restMinutes = minutes - (years * 525600);
        long restDays = restMinutes / 1440;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(minutes + " min = " + years + " y and " + restDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
