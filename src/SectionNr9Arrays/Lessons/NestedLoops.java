package SectionNr9Arrays.Lessons;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        System.out.println("array.length = " + array.length);

        for (int[] outer : array) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array.length; i++) {
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                array[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(array));

        makeTree(5);
    }

    // TODO:
    // Create christmas tree function that takes high of tree as argument

    private static void makeTree(int length) {

        for (int i = 1; i <= length; i++) {
            for (int j = length - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            System.out.print(" ");
            for (int j = length - 3; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2; k > 0; k--) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}
