package SectionNr10.Exercises;

import java.util.*;

public class ArrayListChallengePt1 {

    public Scanner scanner = new Scanner(System.in);
    public List<String> tempList = new ArrayList<>();

    public void groceryList() {
        boolean value = true;

        while (value) {
            String text = """
                    Available actions:\s
                    0 - to shutdown\s
                    1 - to add item(s) to list (comma delimited list)\s
                    2 - to remove any items (comma delimited list)\s
                    Enter a number for which action you want to do:\s""";
            System.out.print(text);
            int choice = Integer.parseInt(this.scanner.nextLine());
            if (choice == 0) {
                System.out.println("Shutting down");
                System.out.println("Final list: \n" + tempList);
                value = false;
            } else if (choice == 1) {
                System.out.println("Add item(s) [separate items by comma]:");
                addOrRemove(1);
                Collections.sort(tempList);
                System.out.println(tempList);
            } else if (choice == 2) {
                System.out.println("Remove item(s) [separate items by comma]:");
                addOrRemove(2);
            }
        }
    }

    public static void addOrRemove(int choice) {
        String choices = scanner.nextLine();
        String[] choicesArr = choices.split(",");
        List<String> choicesList = List.of(choicesArr);
        for (String c: choicesList) {
            if (choice == 1) {
                if (tempList.contains(c)) {
                    System.out.println("List already contains product: " + c + " - skipping");
                } else {
                    tempList.add(c.trim());
                }
            } else {
                if (tempList.contains(c)) {
                    tempList.remove(c);
                } else {
                    System.out.println("There is no product: " + c + " in the list - skipping");
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
