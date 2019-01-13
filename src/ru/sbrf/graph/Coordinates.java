package ru.sbrf.graph;

public class Coordinates implements Movable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordinates() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return(String.format("Coodinates with x = %d, y = %d", x, y));
    }

    @Override
    public void moveTo(int toX, int toY) {
        this.x = toX;
        this.y = toY;
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.x += byX;
        this.y += byY;
    }
}
