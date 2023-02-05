package SectionNr10.Lessons;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class GroceryList {

    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new groceryItem("milk");
        groceryArray[1] = new groceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new groceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new groceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<groceryItem> groceryList = new ArrayList<>();
        groceryList.add(new groceryItem("Butter"));
        groceryList.add(new groceryItem("Yogurt"));
        groceryList.add(0, new groceryItem("apples", "PRODUCE", 6));

        System.out.println(groceryList);

    }
}
