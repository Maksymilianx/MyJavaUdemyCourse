package SectionNr10.Exercises;

import java.util.*;

public class ArrayListChallengePt1 {

    private static Scanner scanner = new Scanner(System.in);

    private static void printActions() {

        String text = """
                Available actions:\s
                0 - to shutdown\s
                1 - to add item(s) to list (comma delimited list)\s
                2 - to remove any items (comma delimited list)\s
                Enter a number for which action you want to do:\s""";

        System.out.println(text);
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i: items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }
    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i: items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    public static void main(String[] args) {
        boolean value = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (value) {
            try {
                printActions();
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    addItems(groceries);
                } else if (choose == 2) {
                    removeItems(groceries);
                } else {
                    value = false;
                }
                System.out.println(groceries);
            } catch (NumberFormatException e) {
                System.out.println("Only numbers 0,1,2 allowed");
            }
        }
    }
}
