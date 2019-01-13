package ru.sbrf.electricity;

public class Lamp implements Electricity {
    private int id;

    public Lamp(int id) {
        this.id = id;
    }

    @Override
    public void electricityOn() {
        System.out.printf("%s is on!\n", this.toString());
    }

    @Override
    public String toString() {
        return String.format("Lamp with id %d", id);
    }
}
