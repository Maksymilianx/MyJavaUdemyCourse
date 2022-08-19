package sectionNr5.Lessons;

public class ForStatements {

    public static void main(String[] args) {

        for (double i = 8; i>=2; i--) {
            System.out.println(
                    "10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i))
            );
        }
        System.out.println("###############################");
        int count = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("###############################");
        System.out.println("Sum 3 and 5 Challenge");
        int sum = 0;
        int countNumbers = 0;
        for (long i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                countNumbers ++;
                if (countNumbers == 5) {
                    System.out.println("The sum of numbers is " + sum);
                    System.out.println("End of loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
