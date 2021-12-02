package Sandro.oopAufgaben.aufgabePerson;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Person> personenList = new LinkedList<>();

        personenList.add(new Person("Lukas", 28, 178, 78));
        personenList.add(new Person("Ingo", 40, 187, 75));
        personenList.add(new Person("Sandro", 25, 185, 94));
        personenList.add(new Person("Bartosz", 25, 177, 100));
        personenList.add(new Person("Lena", 21, 180, 70));
        personenList.add(new Person("Mahir", 24, 175, 90));
        personenList.add(new Person("Gerry", 38, 179, 92));
        personenList.add(new Person("Günther", 45, 183, 70));

        System.out.println();
        System.out.println(values(personenList, Category.HEIGHT));
        System.out.println(values(personenList,Category.AGE));
        System.out.println(values(personenList,Category.WEIGHT));
    }

    public static Person values(LinkedList<Person> personenList, Category category) {

        double sum = 0;
        double avg = 0;
        String angabe = "";
        String bezeichnung = "";
        int min = 10000;
        int max = 0;

        for (int i = 0; i < personenList.size(); i++) {

            if (Category.HEIGHT == category) {

                // Durchschnittsgröße aller Personen berechnen
                sum += personenList.get(i).getHeightCm();
                avg = sum / personenList.size();
                angabe = " Average height of all persons (Ø): ";
                bezeichnung = "cm";

                // kleinste Person aller Personen ermitteln
                if (personenList.get(i).getHeightCm() < min) {
                    min = personenList.get(i).getHeightCm();
                }
                // größte Person aller Personen ermitteln
                if (personenList.get(i).getHeightCm() > max) {
                    max = personenList.get(i).getHeightCm();
                }
            }

            if (Category.AGE == category) {

                // Durchschnittsalter aller Personen berechnen
                sum += personenList.get(i).getAge();
                avg = sum / personenList.size();
                angabe = " Average age of all persons: (123) ";
                bezeichnung = "Years";

                // Jüngste Person aller Personen ermitteln
                if (personenList.get(i).getAge() < min) {
                    min = personenList.get(i).getAge();
                }
                // Älteste Person aller Personen ermitteln
                if (personenList.get(i).getAge() > max) {
                    max = personenList.get(i).getAge();
                }
            }

            if (Category.WEIGHT == category) {
                // Durchschnittsgewicht aller Personen berechnen
                sum += personenList.get(i).getWeight();
                avg = sum / personenList.size();
                angabe = " Average weight of all persons: (kg) ";
                bezeichnung = "kg";

                // Leichteste Person aller Personen ermitteln
                if (personenList.get(i).getWeight() < min) {
                    min = personenList.get(i).getWeight();
                }
                // Schwerste Person aller Personen ermitteln
                if (personenList.get(i).getWeight() > max) {
                    max = personenList.get(i).getWeight();
                }
            }
        }
        return new Person(avg, min, max, angabe,bezeichnung);
    }
}


