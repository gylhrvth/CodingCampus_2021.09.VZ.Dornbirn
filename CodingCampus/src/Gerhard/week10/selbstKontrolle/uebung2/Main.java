package Gerhard.week10.selbstKontrolle.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Plamena", 27, Sex.FEMALE);
        Person person2 = new Person("Lukas", 35, Sex.MALE);
        Person person3 = new Person("Danny", 45, Sex.QUEER);
        Person person4 = new Person("Gerry", 43, Sex.MALE);
        Person person5 = new Person("Bartosz", 24, Sex.MALE);
        Person person6 = new Person("Lena", 24, Sex.FEMALE);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.setName(null);

        System.out.println(person1);


        List<Person> list = new ArrayList<Person>();


//     @Override
//             public String toString(){
//        return getClass().getSimpleName() + "[" +
//
    }


}
