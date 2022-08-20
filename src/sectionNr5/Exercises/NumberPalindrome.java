package sectionNr5.Exercises;

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
        }
        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(1234));
    }
}
