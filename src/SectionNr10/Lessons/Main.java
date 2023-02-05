package SectionNr10.Lessons;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record groceryItem(String name, String type, int count) {

    public groceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}

public class Main {

    public static void main(String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new groceryItem("milk");
        groceryArray[1] = new groceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        String[] stringArray = newList.toArray(new String[0]);
        System.out.println("Array made from ArrayList = " + Arrays.toString(stringArray));
        System.out.println("Length is = " + stringArray.length);
    }
}
