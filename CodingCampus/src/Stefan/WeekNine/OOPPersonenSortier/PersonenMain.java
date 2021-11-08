package Stefan.WeekNine.OOPPersonenSortier;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonenMain {
    public static void main(String[] args) {

        Person women1 = new Women("Ariane", 23, 165, 50, "C");
        Person women2 = new Women("Carola", 33, 170, 55, "B");
        Person women3 = new Women("Carmen", 24, 160, 45, "C");

        Person man1 = new Man("Harald", 25, 170, 70, "Trained");
        Person man2 = new Man("Werner", 35, 175, 70, "not Trained");
        Person man3 = new Man("Stefan", 50, 172, 84, "Trained");

        Person[] names = new Person[]{women1, women2, women3, man1, man2, man3};

        List<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(names));

        PersonMethoden.printUserList(persons);

        //Sortier nach Alter
//        PersonMethoden.sortPersonListAge(persons, PersonAtributes.AGE);
//        System.out.println(persons);

        //Sortier nach Größe
//        PersonMethoden.sortPersonListHight(persons, PersonAtributes.HIGHT);
//        System.out.println(persons);

        //Sortier nach Gewicht
//        PersonMethoden.sortPersonListWeight(persons, PersonAtributes.WEIGHT);
//        System.out.println(persons);

        //Sortiert nach Namen
//        PersonMethoden.sortPersonListName(persons, PersonAtributes.NAME);
//        System.out.println(persons);

    }

}
