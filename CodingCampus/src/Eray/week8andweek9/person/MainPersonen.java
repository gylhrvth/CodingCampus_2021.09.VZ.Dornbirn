package Eray.week8andweek9.person;

import java.util.ArrayList;
import java.util.List;

public class MainPersonen {
    public static void main(String[] args) {
        printAll();
    }

    public static <PersonsArrayGetValues> void printAll() {
        PersonenKlasse personenKlasse1 = new PersonenKlasse("Eray", 21, 1.80, 80);

        PersonenKlasse personenKlasse2 = new PersonenKlasse("Lukas", 25, 1.60, 75);

        PersonenKlasse personenKlasse3 = new PersonenKlasse("Pascal", 30, 1.93, 120);

        PersonenKlasse personenKlasse4 = new PersonenKlasse("Peter", 45, 1.75, 63);

        System.out.println(personenKlasse1);
        System.out.println(personenKlasse2);
        System.out.println(personenKlasse3);
        System.out.println(personenKlasse4);

        //fill List Array with Objects
        List<PersonenKlasse> personenKlasseList = new ArrayList<>();
        personenKlasseList.add(personenKlasse1);
        personenKlasseList.add(personenKlasse2);
        personenKlasseList.add(personenKlasse3);
        personenKlasseList.add(personenKlasse4);

        PersonenKlasse[] personenClasses = new PersonenKlasse[]{personenKlasse1, personenKlasse2, personenKlasse3, personenKlasse4};


        System.out.println("With Array Lists: ");
        System.out.println(printAllValue(personenKlasseList));


    }

    public static ArrayListGetAllValues printAllValue(List<PersonenKlasse> personenKlasseList) {
        PersonenKlasse personMinAge = personenKlasseList.get(0);
        PersonenKlasse personMaxAge = personenKlasseList.get(0);
        double sum = 0;

        for (PersonenKlasse person : personenKlasseList) {
            if (person.getAge() > personMaxAge.getAge()) {
                personMaxAge = person;
            }
            if (person.getAge() < personMinAge.getAge()) {
                personMinAge = person;
            }

            sum += person.getAge();
        }
        double average = sum / personenKlasseList.size();

        return new ArrayListGetAllValues(personMinAge.getAge(), personMaxAge.getAge(), average);
    }
}
