package sectionNr5.Lessons;

public class ForStatements {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
       System.out.println("#####################");
        for (int i=8; i>1; i--) {
            System.out.println("10.000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("#####################");
    }

    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double ammount, double interestRate) {
        return (ammount * (interestRate / 100));
    }
}
