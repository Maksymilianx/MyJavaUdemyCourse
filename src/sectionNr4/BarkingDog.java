package sectionNr4;

import java.util.stream.IntStream;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || hourOfDay > 7 && hourOfDay < 23)
            return false;
        return true;
    }

    public static void main(String[] args) {
        boolean sth = shouldWakeUp(true, -23);
        System.out.println(sth);
    }
}
