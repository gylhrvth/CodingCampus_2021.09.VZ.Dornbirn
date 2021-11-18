package Rauan.Widerholung.KlassePerson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Rauan", 24,"female");
        Person p2 = new Person("SAm", 15, "male");

        List<Person> people = new ArrayList<>();
        people.add(p);
        people.add(p2);
        System.out.println(people);

        for (Attribute attribute : Attribute.values()) {
            printMessageSwitch(attribute);
        }
    }

    private static void printMessageSwitch(Attribute attribute) {
        switch (attribute) {
            case female -> System.out.println("Female");
            case male -> System.out.println("Male");
            case divers -> System.out.println("divers");
        }
    }
}