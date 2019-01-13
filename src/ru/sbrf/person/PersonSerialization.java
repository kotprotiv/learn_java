package ru.sbrf.person;

import java.io.*;

public class PersonSerialization {
    public static void savePerson(Person person, File target) throws IOException {
        System.out.println("Saving " + person.getName());

        if (!target.exists())
            target.createNewFile();

        FileOutputStream fOutput = new FileOutputStream(target);
        ObjectOutputStream oOutput =  new ObjectOutputStream(fOutput);
        oOutput.writeObject(person);
        fOutput.close();
        oOutput.close();
    }

    public static Person loadPerson(File source) throws IOException, ClassNotFoundException {
        System.out.println("Loading " + source.getName());
        FileInputStream fInput = new FileInputStream(source);
        ObjectInputStream oInput = new ObjectInputStream(fInput);
        Person person = (Person) oInput.readObject();
        fInput.close();
        oInput.close();
        return person;
    }
}
