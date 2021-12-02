package Stjepan.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Init {
    public static void main(String[] args) {
        Person person1 = new Person(100,52,"Stjepan",182);
        Person person2 = new Person(60,32,"Marijana",175);
        Person person3 = new Person(70,32,"Zdravko",172);
        Person person4 = new Person(60,32,"Valentina",170);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);




        for(Person person : personList){
            System.out.println(person);
        }



    }

}
