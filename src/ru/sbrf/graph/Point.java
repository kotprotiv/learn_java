package ru.sbrf.graph;

public class Point extends GraphObject implements Movable, Cloneable {
    private Coordinates coordinates;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    private void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Point(Coordinates coordinates, String color) {
        super(color);
        setCoordinates(coordinates);
    }

    public Point (Coordinates coordinates){
        this(coordinates, DEFAULT_COLOR);
    }

    public Point() {
        this(new Coordinates());
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return(String.format("Point with color %s and %s", color, coordinates.toString()));
    }

    @Override
    public Point clone() {
        return new Point(this.coordinates, this.color);
    }

    @Override
    public void moveTo(int toX, int toY) {
        coordinates.moveTo(toX, toY);
    }

    @Override
    public void moveBy(int byX, int byY) {
        coordinates.moveBy(byX, byY);
    }
}
