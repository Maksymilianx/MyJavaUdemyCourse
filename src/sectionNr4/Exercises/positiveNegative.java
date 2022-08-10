package sectionNr4.Exercises;

public class positiveNegative {

    public static void checkNumber(int number) {
        if (number > 0)
            System.out.println("possitive");
        else if (number < 0)
            System.out.println("negative");
        else System.out.println("zero number");
    }

    public static void main (String[] someArgs) {
        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);
    }
}
