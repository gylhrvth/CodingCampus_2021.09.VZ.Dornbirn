package Danny.enumTask.TaskPersonSort;
import Danny.classes.taskPerson.Person;

import java.util.List;

import static Danny.classes.taskPerson.ExerciseClass.*;

public class
ExcerciseEnum {

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

        if (attributeChoice == AttributeChoice.NAME) {
            for (int j = 0; j < persons.size() - 1; j++) {
                for (int i = 0; i < persons.size() - 1; i++) {
                    Person person1 = persons.get(i);
                    Person person2 = persons.get(i + 1);
                    if (isBigger(person1, person2, AttributeChoice.NAME)) {
                        Person tmp = persons.get(i);
                        persons.set(i, person2);
                        persons.set(i + 1, tmp);
                    }
                }
            }
            printPersons(sortList);

        } else if (attributeChoice == AttributeChoice.AGE) {
            for (int j = 0; j < persons.size() - 1; j++) {
                for (int i = 0; i < persons.size() - 1; i++) {
                    Person person1 = persons.get(i);
                    Person person2 = persons.get(i + 1);
                    if (isBigger(person1, person2, AttributeChoice.AGE)) {
                        Person tmp = persons.get(i);
                        persons.set(i, person2);
                        persons.set(i + 1, tmp);
                    }
                }
            }
            printPersons(sortList);

        } else if (attributeChoice == AttributeChoice.SIZE) {
            for (int j = 0; j < persons.size() - 1; j++) {
                for (int i = 0; i < persons.size() - 1; i++) {
                    Person person1 = persons.get(i);
                    Person person2 = persons.get(i + 1);
                    if (isBigger(person1, person2, AttributeChoice.SIZE)) {
                        Person tmp = persons.get(i);
                        persons.set(i, person2);
                        persons.set(i + 1, tmp);
                    }
                }
            }
            printPersons(sortList);

        } else if (attributeChoice == AttributeChoice.WEIGHT) {
            for (int j = 0; j < persons.size() - 1; j++) {
                for (int i = 0; i < persons.size() - 1; i++) {
                    Person person1 = persons.get(i);
                    Person person2 = persons.get(i + 1);
                    if (isBigger(person1, person2, AttributeChoice.WEIGHT)) {
                        Person tmp = persons.get(i);
                        persons.set(i, person2);
                        persons.set(i + 1, tmp);
                    }
                }
            }
            printPersons(sortList);
        }
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
