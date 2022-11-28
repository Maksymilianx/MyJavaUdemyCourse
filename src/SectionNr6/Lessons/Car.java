package SectionNr6.Lessons;

import java.util.Locale;

/**
 *
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if (validModel.equals("panda") || validModel.equals("laferarri")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
