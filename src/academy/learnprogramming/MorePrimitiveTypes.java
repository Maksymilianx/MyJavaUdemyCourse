package academy.learnprogramming;

public class MorePrimitiveTypes {

    public static void main(String[] args) {

        char myChar = 'D';
        // char occupies two bytes of memory or 16 bits and allows us to store Unicode characters.
        // Unicode is an international encoding standard for use with different languages and scripts.
        // unicode-table.com
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        // in Java terms we have boolean primitive type, and it can be set to true or false only.
        boolean isCustomerOverTwentyOne = true;
    }
}
