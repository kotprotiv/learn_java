package ru.sbrf.person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private int age;

    private static List<Person> allPersons = new ArrayList<>();

    public static void showAll(){
        for (Person person : allPersons) {
            person.show();
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        allPersons.add(this);
    }

    public void show(){
        System.out.printf("My name is %s and my age is %d\n", this.name, this.age);
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(this.name, this.age);
    }
}
