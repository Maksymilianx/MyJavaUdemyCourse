package SectionNr6.Exercises;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // return the distance between this Point and Point 0,0 as double
    public double distance() {
        return Math.sqrt((getX() - 0.0) * (getX()) + (getY()) * (getY()));
    }

    // return the distance between this Point and Point x,y as double
    public double distance(int x, int y) {
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    // return the distance between this Point and another Point as double
    public double distance(Point another) {
        return Math.sqrt((getX() - another.getX()) * (getX() - another.getX()) + (getY() - another.getY()) * (getY() - another.getY()));
    }
}
