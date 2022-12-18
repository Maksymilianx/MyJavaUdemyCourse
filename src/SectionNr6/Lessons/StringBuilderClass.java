package SectionNr6.Lessons;

public class StringBuilderClass {

    public static void main(String[] args) {

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInfo(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInfo(StringBuilder builder) {

        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
