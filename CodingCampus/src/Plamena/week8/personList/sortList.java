package Plamena.week8.personList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortList {
    public static void main(String[] args) {
        Person person1 = new Person(170, 35, "Brian", 70);
        Person person2 = new Person(160, 55, "James", 85);
        Person person3 = new Person(155, 25, "Julia", 45);
        Person person4 = new Person(120, 12, "David", 30);
        Person person5 = new Person(190, 46, "Sarah", 41);

        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));
        sortListPers(personList, PersAttr.WEIGHT);
        System.out.println(personList);

    }

    private static void sortListPers(List<Person> personList, PersAttr persAttr) {

        for (int i = 0; i < personList.size(); i++) {
            for (int j = 0; j < personList.size(); j++) {
                if (persAttr == PersAttr.AGE && j > 0 && personList.get(j).getAge() < personList.get(j - 1).getAge()) {
                    Person tmp = personList.get(j);
                    personList.set(j, personList.get(j - 1));
                    personList.set(j - 1, tmp);
                } else if (persAttr == PersAttr.HEIGHT && j > 0 && personList.get(j).getHeight() < personList.get(j - 1).getHeight()) {
                    Person tmp = personList.get(j);
                    personList.set(j, personList.get(j - 1));
                    personList.set(j - 1, tmp);
                } else if (persAttr == PersAttr.WEIGHT && j > 0 && personList.get(j).getWeight() < personList.get(j - 1).getWeight()) {
                    Person tmp = personList.get(j);
                    personList.set(j, personList.get(j - 1));
                    personList.set(j - 1, tmp);
                }
            }
        }
    }
}
