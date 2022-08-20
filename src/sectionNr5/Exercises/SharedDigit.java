package sectionNr5.Exercises;

public class SharedDigit {

    public static boolean hasSharedDigit (int x, int y) {
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
            return false;
        }
        int secondDigit = x % 10;
        x /= 10;
        int firstDigit = x % 10;
        int secondNr2ndDigit = y % 10;
        y /= 10;
        int secondNr1stDigit = y % 10;
        return (firstDigit == secondNr1stDigit) || (firstDigit == secondNr2ndDigit) ||
                (secondDigit == secondNr1stDigit) || (secondDigit == secondNr2ndDigit);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
