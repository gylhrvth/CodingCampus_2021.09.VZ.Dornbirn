package Danny.woche8.day2.AufgabePerson;

import java.util.ArrayList;
import java.util.List;

public class ExerciseClass {
    public static void main(String[] args) {


        Person person1 = new Person("Danny", 41, 186, 73);

        Person person2 = new Person("Bernd", 18, 173, 80);

        Person person3 = new Person("Lissi", 40, 167, 48);

        Person person4 = new Person("Frank", 30, 181, 93);

        Person[] persons = new Person[]{person1, person2, person3, person4};

        int[] ageNumbersArray = new int[]{person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge()};
        int[] sizeNumbersArray = new int[]{person1.getSize(), person2.getSize(), person3.getSize(), person4.getSize()};
        int[] weightNumbersArray = new int[]{person1.getWeight(), person2.getWeight(), person3.getWeight(), person4.getWeight()};

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < persons.length; i++) {
            personList.add(persons[i]);
        }

        printPersons(personList);
        System.out.println();

        MinMaxAverage2 age = getMinMaxAverage2(ageNumbersArray);
        System.out.println("Age: " + age);
        MinMaxAverage2 size = getMinMaxAverage2(sizeNumbersArray);
        System.out.println("Size: " + size);
        MinMaxAverage2 weight = getMinMaxAverage2(weightNumbersArray);
        System.out.println("Weight: " + weight);

    }

    private static void printPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static MinMaxAverage2 getMinMaxAverage2(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        double sum = 0;
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
            if (number > maxValue) {
                maxValue = number;
            }
            sum += number;
        }
        double average = sum / numbers.length;

        return new MinMaxAverage2(minValue, maxValue, average);
    }


}