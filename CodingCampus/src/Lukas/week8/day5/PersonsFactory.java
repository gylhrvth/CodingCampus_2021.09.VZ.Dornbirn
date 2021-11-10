package Lukas.week8.day5;

import java.util.ArrayList;
import java.util.List;

public class PersonsFactory {
    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Array"));
        persons.add(new Person("Danny"));
        persons.add(new Person("Mahir"));
        persons.add(new Person("Stefan"));
        return persons;
    }

    public static List<Person> getPersonGroupA() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Array"));
        persons.add(new Person("Danny"));
        persons.add(new Person("Mahir"));
        persons.add(new Person("Stefan"));
        return persons;
    }
}
