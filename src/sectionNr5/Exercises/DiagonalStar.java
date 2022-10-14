package sectionNr5.Exercises;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
            for (i = 0; i < number; i++) {
                System.out.println("*");
            }
        }
    }


    public static void main(String[] args) {
        printSquareStar(8);
    }
}
