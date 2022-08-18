package sectionNr5.Exercises;

public class NumbersOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        if ((!(year >= 1)) || (!(year <= 9999))) {
            return false;
        } else return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth (int month, int year) {
        boolean isLeap = isLeapYear(year);
        if (((year < 1) || (year > 9999))) {
            return -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeap) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(isLeapYear(9000));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1855));
    }
}
