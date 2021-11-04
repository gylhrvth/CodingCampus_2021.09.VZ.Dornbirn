package Danny.woche8.day2.AufgabePersonenSortiert;

import Danny.woche8.day2.AufgabePerson.ExerciseClass;
import Danny.woche8.day2.AufgabePerson.Person;
import Lukas.week8.day4.MessageType;

import java.util.List;

public class ExcerciseEnum {
    public static void main(String[] args) {


    }

    private static void printMessage(List<Person> persons, AttributeChoice attributeChoice) {



        if (attributeChoice == AttributeChoice.NAME) {
            for (int i = 0; i < persons.size(); i++) {
                Person p = persons.get(i);
                persons.set()
            }
        } else if (attributeChoice == AttributeChoice.AGE) {

        } else if (attributeChoice == AttributeChoice.SIZE) {

        }

    }

    private static boolean isBigger(Person person1, Person person2, AttributeChoice choice) {
        if(choice == AttributeChoice.NAME) {
            return person1.getName().compareTo(person2.getName()) > 0;
        } else if(choice == AttributeChoice.AGE) {
            return person1.getAge() > person2.getAge();
        }
    }

}
