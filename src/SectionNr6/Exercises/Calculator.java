package SectionNr6.Exercises;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Floor getFloor() {
        return floor;
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
