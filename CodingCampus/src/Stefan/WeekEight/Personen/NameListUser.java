package Stefan.WeekEight.Personen;


import Lukas.week8.day3.explenation.MinMaxDurch;
import Plamena.week8.personList.Person;

import java.util.ArrayList;
import java.util.List;

public class NameListUser {
    public static void main(String[] args) {
        Persons name1 = new Persons("Gerold", "m", 23, 170, 80);
        Persons name2 = new Persons("Harald", "m", 40, 165, 65);
        Persons name3 = new Persons("Angela", "w", 35, 160, 50);
        Persons name4 = new Persons("Anabel", "w", 20, 170, 48);
        Persons name5 = new Persons("Elvira","w",13,140,35);

        Persons[] names = new Persons[]{name1, name2, name3, name4, name5};

        List<Persons> persons = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            persons.add(names[i]);
        }

        printUserList(persons);

        System.out.println(durchschnittsAlter(persons));
    }


    //Gibt die vorhandenen Daten aus
    private static void printUserList(List<Persons> user) {
        for (Persons names : user) {
            System.out.println(names);
        }
    }


    //Durchschnittsalter
    public static MinMaxDurch durchschnittsAlter(List<Persons> user) {

        double maxAge = Double.MAX_VALUE;
        double minAge = Double.MIN_VALUE;
        double maxHight = Integer.MAX_VALUE;
        double minHight = Integer.MIN_VALUE;
        double maxWeight = Integer.MAX_VALUE;
        double minWeight = Integer.MIN_VALUE;

        double sumHight = 0;
        double sumWeight = 0;
        double sumAge = 0;

        for (Persons n : user) {
            if (n.getAge() > minAge) {
                minAge = n.getAge();
            }
            if (n.getAge() < maxAge) {
                maxAge = n.getAge();
            }
            if (n.getHeight() > minHight) {
                minHight = n.getHeight();
            }
            if (n.getHeight() < maxHight) {
                maxHight = n.getHeight();
            }
            if (n.getWeight() > minWeight) {
                minWeight = n.getWeight();
            }
            if (n.getWeight() < maxWeight) {
                maxWeight = n.getWeight();

            }
            sumHight += n.getHeight();
            sumWeight += n.getWeight();
            sumAge += n.getAge();
        }

        double durchAge = sumAge / user.size();
        double durchWeight = sumWeight / user.size();
        double durchHight = sumHight / user.size();

        return new MinMaxDurch(minAge, maxAge, minHight, maxHight, minWeight, maxWeight, durchAge, durchWeight, durchHight);
    }


}
