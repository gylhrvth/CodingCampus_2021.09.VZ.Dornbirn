package Stefan.Week10.Selbstkontrolle.oop.excercise4;

import Stefan.Week10.Selbstkontrolle.oop.excercise2.Gender;
import Stefan.Week10.Selbstkontrolle.oop.excercise2.Person;
import Stefan.Week10.Selbstkontrolle.oop.excercise3.House;


public class SortedHouseMain {
    public static void main(String[] args) {

        Person person1 = new Person("Fabian", 23, Gender.MALE);
        Person person2 = new Person("Florian", 33, Gender.MALE);
        Person person3 = new Person("Klara", 25, Gender.FEMALE);
        Person person4 = new Person("Nikol", 40, Gender.FEMALE);
        Person person5 = new Person("Fabiane", 41, Gender.DIVERS);
        Person person6 = new Person("Klarina", 47, Gender.DIVERS);


        House house1 = new SortedHouse(1, 4, "Klangmauer 1");
        house1.addPerson(person1);
        house1.addPerson(person6);
        System.out.println("Bewohner Haus 1");
        System.out.println(house1);
        System.out.println();


        House house2 = new SortedHouse(2,6, "Stangenstrasse 3");
        house2.addPerson(person5);
        house2.addPerson(person2);
        System.out.println("Bewohner Haus 2");
        System.out.println(house2);
        System.out.println();


        House house3 = new SortedHouse(1, 3, "Stringweg 5");
        house3.addPerson(person4);
        house3.addPerson(person3);
        System.out.println("Bewohner Haus 3");
        System.out.println(house3);
    }
}
