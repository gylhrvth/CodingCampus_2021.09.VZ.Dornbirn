package Lukas.week9.day5;

import java.util.*;

public class Equals {
    public static void main(String[] args) {
        Person person = new Person("Peter Pan");
        Person person2 = new Person("Peter Pan");

        System.out.println("Person1 ist gleich Person2: " + (person.equals(person2)));

        System.out.println(person);

        List<Person> persons = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a persons name:");
        for (int i = 0; i < 5; i++) {
            Person newPerson = new Person(scanner.next());
            if (persons.contains(newPerson)) {
                System.out.println("Person already exists...");
            } else {
                persons.add(newPerson);
            }
        }

        System.out.println(persons);

        Map<Integer, Person> map = new HashMap<>();
        map.put(5, new Person("Hallo"));
    }
}
