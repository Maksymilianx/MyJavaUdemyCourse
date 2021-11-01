package academy.learnprogramming;

public class MorePrimitiveTypes {

    public static void main(String[] args) {

        char myChar = 'D';
        // char occupies two bytes of memory or 16 bits and allows us to store Unicode characters.
        // Unicode is an international encoding standard for use with different languages and scripts.
        // unicode-table.com
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println("My Unicode character is " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("Copyright Character is " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        // in Java terms we have boolean primitive type, and it can be set to true or false only.
        boolean isCustomerOverTwentyOne = true;

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        // Java do not raise syntax error like Python when we try to add int to str, Java converts int to str, in order
        // to add two values.
        int another = 50;
        double next = 50.50d;
        another = (int) (another + next);
        System.out.println("Add double with int = " + another );
    }
}
