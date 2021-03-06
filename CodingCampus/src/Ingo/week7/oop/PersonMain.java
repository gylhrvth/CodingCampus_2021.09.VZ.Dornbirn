package Ingo.week7.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person(1.84, 33, "Brandon", 80.40);
        Person person2 = new Person(1.77, 44, "Luki", 74);
        Person person3 = new Person(1.65, 22, "Frida", 62);
        Person person4 = new Person(1.68, 64, "Adelheid", 80.88);
        System.out.println("--------------------------");

        // Attribute verändern mit person1.setName , übernimmt den aktuellen(geänderten) Wert !!!
        person1.setName("Mahir");
        person4.setAge(65);
        System.out.println(person4.getAge());
        System.out.println(person1.getName());

        System.out.println("-------------------------------");


        Person[] personArr = new Person[]{person1, person2, person3, person4};
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(personArr));

        System.out.println(Arrays.toString(personArr));

        System.out.println(personList);

        System.out.println("-----------------------------------------");

        for (int i = 0; i < personArr.length; i++) {
            personList.add(personArr[i]);
            System.out.println(personArr[i]);
        }
        System.out.println("----------------------------------------");
        int[] arr = new int[]{1, 3, 55, -11, -88, 66, 34, 23, -99, 100, 44};
        System.out.println(maxValue(arr));

    }

    public static int maxValue(int[] maxArray) {
        int maxValue = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] > maxValue) {
                maxValue = maxArray[i];
            }
        }
        return maxValue;
    }

    public static int minValue(int[] maxArray) {
        int minValue = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] < minValue) {
                minValue = maxArray[i];
            }
        }
        return minValue;
    }


}


