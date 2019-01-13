package ru.sbrf.electricity;

public class TV implements Electricity {
    private int id;

    public TV(int id) {
        this.id = id;
    }

    @Override
    public void electricityOn() {
        System.out.printf("%s is on!\n", this.toString());
    }

    @Override
    public String toString() {
        return String.format("TV with id %d", id);
    }
}
