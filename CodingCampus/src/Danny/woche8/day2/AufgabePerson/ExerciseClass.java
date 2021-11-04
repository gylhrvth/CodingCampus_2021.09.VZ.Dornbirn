package Danny.woche8.day2.AufgabePerson;

import Danny.woche8.day2.AufgabePersonenSortiert.AttributeChoice;

import java.util.ArrayList;
import java.util.List;

public class ExerciseClass {
    public static void main(String[] args) {

        Person person1 = new Person("Danny", 41, 186, 73);

        Person person2 = new Person("Bernd", 18, 173, 80);

        Person person3 = new Person("Maria", 40, 167, 48);

        Person person4 = new Person("Frank", 30, 181, 93);

        Person[] persons = new Person[]{person1, person2, person3, person4};

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < persons.length; i++) {
            personList.add(persons[i]);
        }

        printPersons(personList);
        System.out.println();
        System.out.println(getMinMaxAverageAge(persons));



    }

    private static void printPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static MinMaxAverage2 getMinMaxAverageAge(Person[] persons) {
        Person minAgePerson = persons[0];
        Person maxAgePerson = persons[0];
        double sumAge = 0;
        for (Person person : persons) {
            if (person.getAge() < minAgePerson.getAge()) {
                minAgePerson = person;
            }
            if (person.getAge() > maxAgePerson.getAge()) {
                maxAgePerson = person;
            }
            sumAge += person.getAge();
        }
        double averageAge = sumAge / persons.length;

        Person minSizePerson = persons[0];
        Person maxSizePerson = persons[0];
        double sumSize = 0;
        for (Person person : persons) {
            if (person.getSize() < minSizePerson.getSize()) {
                minSizePerson = person;
            }
            if (person.getSize() > maxSizePerson.getSize()) {
                maxSizePerson = person;
            }
            sumSize += person.getSize();
        }
        double averageSize = sumSize / persons.length;

        Person minWeightPerson = persons[0];
        Person maxWeightPerson = persons[0];
        double sumWeight = 0;
        for (Person person : persons) {
            if (person.getWeight() < minWeightPerson.getWeight()) {
                minWeightPerson = person;
            }
            if (person.getWeight() > maxWeightPerson.getWeight()) {
                maxWeightPerson = person;
            }
            sumWeight += person.getWeight();
        }
        double averageWeight = sumWeight / persons.length;
        return new MinMaxAverage2(minAgePerson, maxAgePerson, averageAge
                , minSizePerson, maxSizePerson, averageSize
                , minWeightPerson, maxWeightPerson, averageWeight
        );

    }
}
