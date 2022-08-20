package sectionNr5.Exercises;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 1) {
            int lastNumber = number % 10;
            if (number % 2 == 0) {
                sum += lastNumber;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
