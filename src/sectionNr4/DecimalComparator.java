package sectionNr4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        return ((int)(x * 1000)) - ((int)(y * 1000)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.234,3.2347));
        System.out.println(areEqualByThreeDecimalPlaces(3.234,3.234));
        System.out.println(areEqualByThreeDecimalPlaces(3.234,3.415));
    }
}
