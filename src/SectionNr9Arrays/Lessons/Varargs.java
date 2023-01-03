package SectionNr9Arrays.Lessons;

public class Varargs {

    public static void main(String... args) {

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));
    }

    public static void printText(String... textList) {

        // enhanced for loop or for-each loop
        for (String t: textList) {
            System.out.println(t);
        }
    }
}
