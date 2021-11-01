package academy.learnprogramming;

public class Expressions {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 / 3), exactly like modulo in Python
        System.out.println("4 % 3 = " + result);

        result++;    // result = result + 1 similar to (result += 1)
        System.out.println("1 + 1 = " + result);

        result--;   // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2;    // result = result + 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;   // result = result * 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;    // result = result / 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;    // result = result - 2;
        System.out.println("10 - 2 = " + result);

        // in order to execute more than one statement we need to add a code block: if (expression) { // statements }
        // Always use a code block to avoid simple bugs in the future.
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // double ampersand (&&) stands for "AND" operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // double pipe (||) stand for "OR" operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        // instead of: if (isCar == false) we use: if(!isCar)
        boolean isCar = true;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        // the ternary operator "?" is a shortcut to assigning one of two values to a variable depending on a given condition.
        // It's a shortcut of the if-then-else statement.
        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (!wasCar) {
            System.out.println("wasCar is false");
        }


        // Operator challenge

        double myDoubleVariable = 20.00d;
        double mySecondDoubleVariable = 80.00d;
        double sumOfDouble = (myDoubleVariable + mySecondDoubleVariable) * 100.00d;
        System.out.println("sumOfDouble = " + sumOfDouble);
        double remainder = sumOfDouble % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("ZeroRemainder = " + isNoRemainder);
        // true if remainder is equal to 0, false if it is not
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
