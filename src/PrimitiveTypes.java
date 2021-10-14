public class PrimitiveTypes {
    public static void main(String[] args) {
        // sout is a keyboard shortcut for System.out.println()

        // An int, has a much larger range as we know, and occupies 32 bits, and has a width of 32.
        // Each primitive type occupies a different amount of memory - we can see that int needs four times
        // the amount of space, then a byte does for example.

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("Max int with spaces in code " + myMaxIntTest);

        // We can use byte instead of int when we want to save memory. A smaller data type takes up less space, and can
        // be quicker to access.
        // Byte occupies 8 bits, we say that a byte has a width of 8.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // A short can store a large range of numbers and occupies 16 bits, and has a width of 16.

        long myLongValue = 100L;
        // Long literal ends with uppercase L
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        // Without the L at the end of our number Java tells us that this number is too large to be an int.
        System.out.println(bigLongLiteralValue);
    }
}
