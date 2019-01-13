package ru.sbrf.graph;

import java.io.Serializable;

public class Circle extends GraphObject implements Scalable, Movable {

    protected Coordinates center;
    protected int radius;

    public Coordinates getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Radius can't be less then 0!");
        this.radius = radius;
    }

    public Circle(Coordinates center, int radius, String color){
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, int radius, String color){
        this(new Coordinates(x, y), radius, color);
    }

    public Circle(Coordinates center, int radius){
        this(center, radius, DEFAULT_COLOR);
    }

    public Circle() {
        this(new Coordinates(0, 0), 0, DEFAULT_COLOR);
    }


    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return(String.format("Circle with color %s, radius %d and center %s", color, radius, center.toString()));
    }

    @Override
    public Circle clone() {
        return new Circle(this.center, this.radius, this.color);
    }

    @Override
    public void scale(double rate) {
        setRadius((int)(this.radius * rate));
    }

    @Override
    public void moveTo(int toX, int toY) {
        this.center.moveTo(toX, toY);
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.center.moveBy(byX, byY);
    }
}
