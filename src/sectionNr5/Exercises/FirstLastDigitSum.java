package sectionNr5.Exercises;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number + number;
        }
        int stored = number;
        int sum = 0;

        int lastDigit = stored % 10;
        sum += lastDigit;
        while (stored > 0) {
            stored /= 10;
            if ((stored > 10) && (stored <= 99)) {
                stored /= 10;
                sum += stored;
                return sum;
            } else if ((stored >= 1) && (stored < 10)) {
                sum += stored;
                return sum;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(11));
    }
}
