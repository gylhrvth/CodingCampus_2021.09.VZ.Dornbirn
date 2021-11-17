package Stefan.Week10.Selbstkontrolle.oop.excercise3;

import Stefan.Week10.Selbstkontrolle.oop.excercise2.Gender;
import Stefan.Week10.Selbstkontrolle.oop.excercise2.Person;


public class HouseMain {
    public static void main(String[] args) {
        Person person1 = new Person("Fabian", 23, Gender.MALE);
        Person person2 = new Person("Florian", 33, Gender.MALE);
        Person person3 = new Person("Klara", 25, Gender.FEMALE);
        Person person4 = new Person("Nikol", 40, Gender.FEMALE);
        Person person5 = new Person("Fabiane", 41, Gender.DIVERS);
        Person person6 = new Person("Klarina", 47, Gender.DIVERS);


        //Bewohner Haus Hollander
        House house1 = new House(1, 4, "Hollander 3");
        house1.addPerson(person1);
        house1.addPerson(person2);

        System.out.println("Haus Hollander");
        System.out.println(house1);
        System.out.println();


        //Bewohner Haus Gallus
        House house2 = new House(2, 8, "Gallus 13");
        house2.addPerson(person4);
        house2.addPerson(person5);

        System.out.println("Haus Gallus:");
        System.out.println(house2);
        System.out.println();

        //Bewohner Haus Karlson
        House house3 = new House(1, 5, "Karlson 3");
        house3.addPerson(person3);
        house3.addPerson(person6);

        System.out.println("Haus Kralson:");
        System.out.println(house3);

//
//        House[] house = new House[]{house1, house2, house3};
//        List<House> houses = new ArrayList<>(Arrays.asList(house));
//
//
//        for (House test : houses) {
//            System.out.println(test);
//        }
    }
}
