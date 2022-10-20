package sectionNr5.Lessons;

import java.util.Calendar;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int year = Calendar.getInstance().get(Calendar.YEAR);

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = year - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Invalid something");
        }

        scanner.close();
    }
}
