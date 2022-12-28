package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(12);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(forthArray));

        Arrays.sort(forthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(forthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "AAAA", "Lol", "Dawid"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Dawid") >= 0) {
            System.out.println("Found Dawid in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
