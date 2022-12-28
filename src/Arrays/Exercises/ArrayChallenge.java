package Arrays.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] unsortedArray = randomArray(5);
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));

        int[] sortedDescending = sortintegers(unsortedArray);
        System.out.println("Sorted descending = " + Arrays.toString(sortedDescending));
    }

    private static int[] randomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }
        return newInt;
    }

    private static int[] sortintegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[0] > sortedArray[1] && sortedArray[1] > sortedArray[2] &&
                        sortedArray[2] > sortedArray[3] && sortedArray[3] > sortedArray[4]) {
                    return sortedArray;
                }
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
