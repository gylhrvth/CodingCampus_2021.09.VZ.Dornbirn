package Stefan.Week9.OOPPersonenSortier;


import java.util.List;

public class PersonMethoden {

    //Listet alle Personen auf
    public static void printUserList(List<Person> user) {
        for (Person names : user) {
            System.out.println(names);
        }
    }

    public static void sortPersonListAge(List<Person> persons, PersonAtributes attribute) {
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                if (attribute == PersonAtributes.AGE) {
                    if (persons.get(j).getAge() > persons.get(j + 1).getAge()) {
                        Person temp = persons.get(j);
                        persons.set(j, persons.get((j + 1)));
                        persons.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void sortPersonListHight(List<Person> persons, PersonAtributes attribute) {
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                if (attribute == PersonAtributes.HIGHT) {
                    if (persons.get(j).getHeight() > persons.get(j + 1).getHeight()) {
                        Person temp = persons.get(j);
                        persons.set(j, persons.get((j + 1)));
                        persons.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void sortPersonListWeight(List<Person> persons, PersonAtributes attribute) {
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                if (attribute == PersonAtributes.WEIGHT) {
                    if (persons.get(j).getWeight() > persons.get(j + 1).getWeight()) {
                        Person temp = persons.get(j);
                        persons.set(j, persons.get((j + 1)));
                        persons.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void sortPersonListName(List<Person> persons, PersonAtributes attribute) {
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size() - 1 - i; j++) {
                if (attribute == PersonAtributes.NAME) {
                    if (persons.get(j).getName().compareTo(persons.get(j + 1).getName()) > 0) {
                        Person temp = persons.get(j);
                        persons.set(j, persons.get((j + 1)));
                        persons.set(j + 1, temp);
                    }
                }
            }
        }
    }
}
