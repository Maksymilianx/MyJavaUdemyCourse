package sectionNr5.Exercises;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int count = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                count++;
                int number = scanner.nextInt();
                sum = number + sum;

            } else {
                average = sum/count;
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(average));
        scanner.close();

    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
