package ru.sbrf.person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Cloneable, Comparable<Person>, Serializable {
    private String name;
    private int age;
    private transient double random = Math.random();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Person> allPersons = new ArrayList<>();

    public static void showAll() {
        // Collections.sort(allPersons);
        for (Person person : allPersons) {
            person.show();
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        allPersons.add(this);
    }

    public void show() {
        System.out.println(this.toString());
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }

    @Override
    public String toString() {
        return String.format("My name is %s and my age is %d (random is %f)", this.name, this.age, this.random);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

