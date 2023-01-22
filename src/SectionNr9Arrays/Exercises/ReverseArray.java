package SectionNr9Arrays.Exercises;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        System.out.println("First method " + Arrays.toString(firstReverse(intArray)));
        secondReverse(intArray);
        System.out.println("Second method " + Arrays.toString(intArray));
    }

    private static int[] firstReverse(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }

    private static void secondReverse(int[] intArray) {
        int length = intArray.length;
        int [] reversedArray = intArray.clone();
        for (int i = 0; i < length; i++) {
            intArray[i] = reversedArray[length - 1 - i];
        }
    }
}
