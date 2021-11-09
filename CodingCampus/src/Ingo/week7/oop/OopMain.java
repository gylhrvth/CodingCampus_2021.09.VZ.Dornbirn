package Ingo.week7.oop;

import java.util.ArrayList;
import java.util.List;

public class OopMain {
    public static void main(String[] args) {

        Human human = new Human("Ingo", 47, 74);
        Human human1 = new Human("Rick", 33, 88);

        System.out.println("-------------------------------");

        System.out.println(human.getName());
        System.out.println(human1.getAge());

        human1.drink();
        human.all();
        human.eat();

        human1.eat();

        System.out.println("------------------------------------");


        Person person1 = new Person(1.84,33,"Brandon",80.40);
        Person person2 = new Person(1.77,44,"Luki",74);
        Person person3 = new Person(1.65,22,"Frida",62);
        System.out.println();

        // Animal Class
        Animal animal1 = new Animal("Kitti",5,8,"Katze");
        Animal animal2 = new Animal("Bello",7,22,"Hund");
        Animal animal3 = new Animal("Piepsi",3,1,"Vogel");
        Animal animal4 = new Animal("Muhi",9,432,"Kuh");

        System.out.println("Alter " + animal1.age +" Gewicht " + animal2.weight+ " Namae " + animal4.name);

        animal1.eat();
        animal2.drink();

        Animal[] animals = new Animal[]{animal1,animal2,animal3,animal4};
        List<Animal> animalList = new ArrayList<>();

    }


}
