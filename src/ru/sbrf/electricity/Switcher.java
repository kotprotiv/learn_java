package ru.sbrf.electricity;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    public void switchOn() {
        System.out.println("Switcher is on!");
        for (Electricity listener : listeners) {
            listener.electricityOn();
        }
    }

    private List<Electricity> listeners = new ArrayList<>();

    public void addElectricityListener(Electricity listener) {
        if (!listeners.contains(listener))
            listeners.add(listener);
    }

    public void removeElectricityListener(Electricity listener) {
        listeners.remove(listener);
    }
}
