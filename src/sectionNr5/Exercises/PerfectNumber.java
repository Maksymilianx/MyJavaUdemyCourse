package sectionNr5.Exercises;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        if (num < 1) {
            return false;
        } else {
            for (int i=1; i<num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return num == sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
