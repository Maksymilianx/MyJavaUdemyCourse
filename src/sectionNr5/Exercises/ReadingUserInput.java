package sectionNr5.Exercises;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner someScannerNameDoNotMatters = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = someScannerNameDoNotMatters.hasNextInt();

            if (isAnInt) {
                int number = someScannerNameDoNotMatters.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            someScannerNameDoNotMatters.nextLine(); // handle end of the line (enter key)
        }
        System.out.println("sum = " + sum);
        someScannerNameDoNotMatters.close();
    }
}
