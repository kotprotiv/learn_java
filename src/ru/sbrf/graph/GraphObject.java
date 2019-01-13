package ru.sbrf.graph;

import java.util.ArrayList;
import java.util.List;

public abstract class GraphObject {
    protected static final String DEFAULT_COLOR = "black";
    protected String color;
    private static List<GraphObject> scene = new ArrayList<>();

    public GraphObject(String color) {
        this.color = color;
        scene.add(this);
    }

    public GraphObject() {
        this(DEFAULT_COLOR);
    }


    public static void drawScene(){
        for (GraphObject go : scene) {
            go.draw();
        }
    }

    public static void scaleScene(double rate){
        for (GraphObject go : scene) {
            if (go instanceof Scalable)
                ((Scalable)go).scale(rate);
        }
    }

    public static void moveScene(int byX, int byY){
        for (GraphObject go : scene) {
            if (go instanceof Movable)
                ((Movable)go).moveBy(byX, byY);
        }
    }

    public abstract void draw();
}
