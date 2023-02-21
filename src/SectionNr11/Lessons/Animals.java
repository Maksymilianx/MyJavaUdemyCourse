package SectionNr11.Lessons;

public abstract class Animals {

    protected String type;
    private String size;
    private double weight;

    public Animals(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();
}
