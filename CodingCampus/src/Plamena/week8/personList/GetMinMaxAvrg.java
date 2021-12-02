package Plamena.week8.personList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMinMaxAvrg {
    public static void main(String[] args) {
        Person person1 = new Person(170, 35, "Brian", 70);
        Person person2 = new Person(160, 55, "James", 85);
        Person person3 = new Person(155, 25, "Julia", 45);
        Person person4 = new Person(120, 12, "David", 30);
        Person person5 = new Person(190, 46, "Sarah", 41);

        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        System.out.println(getMinMaxAvrgPerson(personList));

    }

    private static MinMaxAvrgPerson getMinMaxAvrgPerson(List<Person> personList) {
        int minAge = 150;
        int minHeight = 250;
        int minWeight = 250;
        int maxAge = 0;
        int maxHeight = 0;
        int maxWeight = 0;
        double sumAge = 0;
        double sumHeight = 0;
        double sumWeight = 0;
        String youngestPers ="";
        String lightestPers = "";
        String tallestPers ="";
        String oldestPers = "";
        String heaviestPers ="";
        String smallestPers ="";

        for (Person person:personList) {
            if(person.getAge() < minAge){
                minAge = person.getAge();
                youngestPers = person.getName();
            }
            if(person.getHeight() < minHeight){
                minHeight = person.getHeight();
                smallestPers = person.getName();
            }
            if(person.getWeight() < minWeight){
                minWeight = person.getWeight();
                lightestPers =person.getName();
            }
            if(person.getAge() > maxAge){
                maxAge = person.getAge();
                oldestPers = person.getName();
            }
            if(person.getHeight() > maxHeight){
                maxHeight = person.getHeight();
                tallestPers = person.getName();
            }
            if(person.getWeight() > maxWeight){
                maxWeight = person.getWeight();
                heaviestPers = person.getName();
            }
        }
        for (Person person:
             personList) {
            sumAge += person.getAge();
            sumHeight += person.getHeight();
            sumWeight += person.getWeight();
        }

        double avrgAge = sumAge/(double) personList.size();
        double avrgHeight = sumHeight/(double) personList.size();
        double avrgWeight = sumWeight/(double) personList.size();
        return new MinMaxAvrgPerson(avrgAge,avrgHeight,avrgWeight,
                youngestPers, minAge, smallestPers, minHeight, lightestPers, minWeight,
                oldestPers, maxAge, tallestPers, maxHeight, heaviestPers, maxWeight);
    }
}
