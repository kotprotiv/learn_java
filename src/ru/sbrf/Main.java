package ru.sbrf;

import ru.sbrf.electricity.*;

import ru.sbrf.graph.*;
import ru.sbrf.person.Person;
import ru.sbrf.singleton.Singleton;
import ru.sbrf.banking.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static String doSomething(UnaryOperator<String> strMethod, String str) {
        return strMethod.apply(str);
    }


    public static void main(String[] args) {
        // graph
        /*
        Circle c1 = new Circle(10, 10, 15, "red");
        // c1.draw();

        Circle c2 = new Circle(4, 4, 10, "green");

        c2.moveTo(0, 0);

        GraphObject.drawScene();
        GraphObject.scaleScene(2);
        GraphObject.moveScene(5, 10);
        System.out.println("---------------------");
        GraphObject.drawScene();
        */

        // person
        /*
        Person p1 = new Person("Ian", 22);
        Person p2 = new Person("John", 45);
        Person p3 = new Person("Jennies", 13);
        Person p4 = new Person("Mike", 52);

        Person.showAll();
        */

        // singleton
        /*
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        */

        // banking
        /*
        BankAccount ivan = new BankAccount("Ivan", 1000);
        BankAccount petr = new BankAccount("Petr", 500);

        System.out.println(BankAccount.transfer(ivan, petr, 500));
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(BankAccount.transfer(ivan, petr, 600));
        System.out.println(ivan);
        System.out.println(petr);
        */

        // electricity
//        System.out.println(Main.doSomething(String::toUpperCase, "test"));

        Switcher switcher = new Switcher();

        Lamp lamp1 = new Lamp(1);
        Lamp lamp2 = new Lamp(2);
        TV tv1 = new TV(1);
        TV tv2 = new TV(2);

        switcher.addElectricityListener(lamp1);
        switcher.addElectricityListener(lamp2);
        switcher.addElectricityListener(tv1);
        switcher.addElectricityListener(tv2);


        Electricity object1 = () -> System.out.println("Object1 is on!");
        switcher.addElectricityListener(object1);

        switcher.switchOn();
    }
}
