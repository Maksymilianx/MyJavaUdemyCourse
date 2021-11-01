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

        // double ampersand (&&) stands for "and"
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
