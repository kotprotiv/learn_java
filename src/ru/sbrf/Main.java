package ru.sbrf;

import ru.sbrf.electricity.*;

import ru.sbrf.graph.*;
import ru.sbrf.person.*;
import ru.sbrf.singleton.Singleton;
import ru.sbrf.banking.BankAccount;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static String doSomething(UnaryOperator<String> strMethod, String str) {
        return strMethod.apply(str);
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        Person p1 = new Person("Yannis", 22);
        Person p2 = new Person("Liam", 45);
        Person p3 = new Person("Jennies", 13);
        Person p4 = new Person("Mike", 52);


        Collections.sort(Person.allPersons,
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                }
        );

        Person.showAll();

        for (Person person : Person.allPersons) {
            PersonSerialization.savePerson(person, new File("../" + person.getName() + ".bin"));
        }

        Person pNew = PersonSerialization.loadPerson(new File("../Yannis.bin"));
        pNew.show();


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
        /*
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

        */


        // files
        /*
        File directory = new File("../OOP");
        if (!directory.exists()) {
            try {
                directory.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File[] allFiles = directory.listFiles(f -> f.getName().contains("r"));

        for (File f : allFiles) {
            System.out.println(f.getName());
        }

        FileWriter fw = new FileWriter("../file.txt");
        fw.write("yo momma so fat ");
        fw.close();
        */
    }
}




