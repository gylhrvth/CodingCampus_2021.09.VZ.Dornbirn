package Sandro.oopAufgaben.aufgabePerson;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Person> personenList = new LinkedList<>();

        personenList.add(new Person("Sandro", 25, 185, 92));
        personenList.add(new Person("Bartosz", 25, 180, 100));
        personenList.add(new Person("Lena", 23, 180, 70));
        personenList.add(new Person("Eray", 24, 177, 82));
        personenList.add(new Person("Gerry", 38, 179, 92));

        System.out.println(values(personenList));
    }

    public static Person values(LinkedList<Person> personenList) {

        double sum = 0;
        double avg = 0;

        int smallest = personenList.get(0).getHeightCm();
        int tallest = personenList.get(0).getHeightCm();
        int ageYoungest = personenList.get(0).getAge();
        int ageOldest = personenList.get(0).getAge();
        int lowestWeight = personenList.get(0).getWeight();
        int highestWeight = personenList.get(0).getWeight();

        // Durchschnittstalter aller Personen berechnen
        for (int i = 0; i < personenList.size(); i++) {
            sum += personenList.get(i).getAge();
            avg = sum / personenList.size();
        }
        // kleinste Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getHeightCm() < smallest) {
                smallest = personenList.get(i).getHeightCm();
            }
        }
        // größte Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getHeightCm() > tallest) {
                tallest = personenList.get(i).getHeightCm();
            }
        }
        // Jüngste Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getAge() < ageYoungest) {
                ageYoungest = personenList.get(i).getAge();
            }
        }
        // Älteste Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getAge() > ageOldest) {
                ageOldest = personenList.get(i).getAge();
            }
        }
        // Leichtest Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getWeight() < lowestWeight) {
                lowestWeight = personenList.get(i).getWeight();
            }
        }
        // Schwerste Person aller Personen ermitteln
        for (int i = 0; i < personenList.size(); i++) {
            if (personenList.get(i).getWeight() > highestWeight) {
                highestWeight = personenList.get(i).getWeight();
            }
        }
        return new Person(avg, smallest, tallest, ageYoungest, ageOldest, lowestWeight, highestWeight);
    }
}

