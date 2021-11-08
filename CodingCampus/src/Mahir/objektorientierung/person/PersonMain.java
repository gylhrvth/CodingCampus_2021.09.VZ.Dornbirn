package Mahir.objektorientierung.person;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(1.72, 27, "Tom", 75);
        Person person2 = new Person(1.84, 34, "David", 81);
        Person person3 = new Person(1.67, 29, "Klaus", 72);
        Person person4 = new Person(1.92, 40, "Georg", 92);
        Person person5 = new Person(1.76, 32, "Tim", 86);

        Person[] persons = new Person[]{person1, person2, person3, person4, person5};
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(persons));

        System.out.println();
        System.out.println("min max Age");
        System.out.println(minMaxAvrg(personList, UnitType.AGE));
        System.out.println("\nmin max Weight");
        System.out.println(minMaxAvrg(personList, UnitType.WEIGHT));
        System.out.println("\nmin max Height");
        System.out.println(minMaxAvrg(personList, UnitType.HEIGHT));

    }


    private static PersonGetMinMaxAvg minMaxAvrg(List<Person> values, UnitType unitType) {


        Person minAge = values.get(0);
        Person maxAge = values.get(0);
        double ageSumm = 0;


        Person minHeight = values.get(0);
        Person maxHeight = values.get(0);
        double heightSumm = 0;

        Person minWeight = values.get(0);
        Person maxWeight = values.get(0);
        double weightSumm = 0;

        if (unitType == unitType.AGE) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).getAge() <= minAge.getAge()) {
                    minAge = values.get(i);
                }
                if (values.get(i).getAge() >= maxAge.getAge()) {
                    maxAge = values.get(i);
                }
                ageSumm += values.get(i).getAge();
            }
            double ageAvg = ageSumm / values.size();
            return new PersonGetMinMaxAvg(minAge, maxAge, ageAvg);
        }
        if (unitType == UnitType.WEIGHT) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).getWeight() <= minWeight.getWeight()) {
                    minWeight = values.get(i);
                }
                if (values.get(i).getWeight() >= maxWeight.getWeight()) {
                    maxWeight = values.get(i);
                }
                weightSumm += values.get(i).getWeight();
            }

            double weightAvg = weightSumm / values.size();
            return new PersonGetMinMaxAvg(minWeight, maxWeight, weightAvg);
        }
        if (unitType == UnitType.HEIGHT) {
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).getHeight() < minHeight.getHeight()) {
                    minHeight = values.get(i);
                }
                if (values.get(i).getHeight() > maxHeight.getHeight()) {
                    maxHeight = values.get(i);
                }
                heightSumm += values.get(i).getHeight();
            }
            double heightAvg = heightSumm / values.size();
            return new PersonGetMinMaxAvg(minHeight, maxHeight, heightAvg);

        }
        return null;
    }
}
