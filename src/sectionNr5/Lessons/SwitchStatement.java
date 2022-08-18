package sectionNr5.Lessons;

import java.util.Locale;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");

            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        System.out.println("######### Practice ##########");

        char charValue = 'D';

        switch (charValue) {
            case 'A':
                System.out.println("Found A");
                break;

            case 'B':
                System.out.println("Found B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        System.out.println("########## Months switch ##########");

        String month = "JANUAry";
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
