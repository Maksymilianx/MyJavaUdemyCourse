package SectionNr9Arrays;

import java.util.*;

public class KeepHydrated {

    public static long[] powersOfTwo(int n) {
        long[] arr = new long[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.pow(2, i));
        }
        return arr;
    }

    public static int grow(int[] x) {
        int result = 1;
        for (int a : x) {
            result *= a;
        }
        return result;
    }

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String subtractSum (int n) {
        if (n >= 10 && n < 10000) {
            if (n > 999) {

                while (n > 100) {
                    int first = n / 1000 % 10;
                    int second = n / 100 % 10;
                    int third = n / 10 % 10;
                    int fourth = n % 10;
                    int sum = first + second + third + fourth;
                    n = n - sum;
                }
            } else {

                while (n > 100) {
                    int first = n / 100 % 10;
                    int second = n / 10 % 10;
                    int third = n % 10;
                    int sum = first + second + third;
                    n = n - sum;
                }
            }
        }
        return switch (n) {
            case 1, 3, 24, 26, 47, 49, 68, 70, 91, 93 -> "kiwi";
            case 2, 21, 23, 42, 44, 46, 65, 67, 69, 88 -> "pear";
            case 4, 6, 25, 29, 48, 50, 71, 73, 92, 94, 96 -> "banana";
            case 5, 7, 28, 30, 32, 51, 53, 74, 76, 95, 97 -> "melon";
            case 8, 10, 12, 31, 33, 52, 56, 75, 77, 79, 98, 100 -> "pineapple";
            case 9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99 -> "apple";
            case 11, 13, 34, 55, 57, 59, 78, 80 -> "cucumber";
            case 14, 16, 35, 37, 39, 58, 60, 83 -> "orange";
            case 15, 17, 19, 38, 40, 61, 82, 84, 86 -> "grape";
            case 20, 22, 41, 43, 62, 64, 66, 85, 87, 89 -> "cherry";
            default -> null;
        // another solution instead of switch was HashMap:
            // HashMap<Integer, String> map = new HashMap<Integer, String>() {{
            //      put(1, "kiwi); etc.
        };
    }
    public static int getCount(String str) {
        int numOfConsonants = 0;
        String[] strings = str.split("");
        if (strings[0].isEmpty()) {
            return 0;
        }
        for (int i=0; i<strings.length; i++) {
            if (Character.isLetter(str.charAt(i))) {
                numOfConsonants++;
            }
            if (Objects.equals(strings[i], "a") || Objects.equals(strings[i], "e") || Objects.equals(strings[i], "i") ||
                    Objects.equals(strings[i], "o") || Objects.equals(strings[i], "u")) {
                numOfConsonants--;
            }
        }
        return numOfConsonants;
    }
    public static int solution(int start, int finish) {
        int distance = finish - start;
        int moves = 0;
        while (distance != 0) {
            if (distance % 3 == 0) {
                return distance / 3;
            } else {
                if (distance > 3) {
                    distance = distance - 3;
                    moves++;
                }
                if (distance >= 1 && distance < 3) {
                    moves++;
                    distance--;
                }
            }
        }
        return moves;

        // easier coding:
        // return distance / 3 + distance % 3;
        // instead of entire while loop

    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(powersOfTwo(4)));
//        System.out.println(grow(new int[]{4,1,1,1,4}));
//        System.out.println(shortcut("how are you today?"));
//        System.out.println(subtractSum(150));
//        System.out.println(getCount(""));
        System.out.println(solution(434,469));
    }

}