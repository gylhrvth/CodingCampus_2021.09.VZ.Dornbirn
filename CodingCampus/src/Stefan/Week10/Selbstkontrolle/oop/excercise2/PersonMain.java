package Stefan.Week10.Selbstkontrolle.oop.excercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person("Fabian", 23, Gender.MALE);
        Person person2 = new Person("Florian", 33, Gender.MALE);
        Person person3 = new Person("Klara", 25, Gender.FEMALE);
        Person person4 = new Person("Nikol", 40, Gender.FEMALE);
        Person person5 = new Person("Fabiane", 41, Gender.DIVERS);
        Person person6 = new Person("Klarina", 47, Gender.DIVERS);


        Person[] personsArray = new Person[]{person1, person2, person3, person4, person5, person6};
        List<Person> persons = new ArrayList<>(Arrays.asList(personsArray));

        for (Person test : persons) {
            System.out.println(test);
        }

    }
}
