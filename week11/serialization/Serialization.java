package week11.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {
        Person[] persons = { new Person("Javid", 18), new Person("Orkhan", 23) };
        savePersons(persons, "persons.dat");
        readAndPrintPersons("persons.dat");

    }

    public static void savePersons(Person[] persons, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
            System.out.println("Persons saved successfully");
        } catch (IOException e) {
            System.out.println("Error occured during convertion of Person objects into byte streams");
            e.printStackTrace();
        }

    }

    public static void readAndPrintPersons(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person[] persons = (Person[]) ois.readObject();
            for (Person person : persons) {
                System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
            }
        } catch (EOFException e) {
            System.out.println("All persons have been read from the file");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occured during conversion of byte streams to Person object");
            e.printStackTrace();
        }
    }

}
