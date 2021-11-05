package Danny.woche8.klassen.aufgabePersonenSortiert;

import Danny.woche8.klassen.aufgabePerson.Person;

import java.util.List;

import static Danny.woche8.klassen.aufgabePerson.ExerciseClass.*;

public class ExcerciseEnum {

    static List<Person> sortList = personList(persons);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Unsort List");
        printPersons(personList(persons));
        System.out.println();
        System.out.println("Sort by Name");
        sortListWithEnum(sortList, AttributeChoice.NAME);
        System.out.println();
        System.out.println("Sort by Age");
        sortListWithEnum(sortList, AttributeChoice.AGE);
        System.out.println();
        System.out.println("Sort by Size");
        sortListWithEnum(sortList, AttributeChoice.SIZE);
        System.out.println();
        System.out.println("Sort by Weight");
        sortListWithEnum(sortList, AttributeChoice.WEIGHT);

    }

    private static void sortListWithEnum(List<Person> persons, AttributeChoice attributeChoice) {

        for (int j = 0; j < persons.size() - 1; j++) {
            for (int i = 0; i < persons.size() - 1; i++) {
                Person person1 = persons.get(i);
                Person person2 = persons.get(i + 1);
                if (isBigger(person1, person2, attributeChoice)) {
                    Person tmp = persons.get(i);
                    persons.set(i, person2);
                    persons.set(i + 1, tmp);
                }
            }
        }
        printPersons(sortList);
    }

    private static boolean isBigger(Person person1, Person person2, AttributeChoice choice) {
        if (choice == AttributeChoice.NAME) {
            return person1.getName().compareTo(person2.getName()) > 0;
        } else if (choice == AttributeChoice.SIZE) {
            return person1.getSize() > person2.getSize();
        } else if (choice == AttributeChoice.AGE) {
            return person1.getAge() > person2.getAge();
        } else if (choice == AttributeChoice.WEIGHT) {
            return person1.getWeight() > person2.getWeight();
        }
        return true;
    }
}
