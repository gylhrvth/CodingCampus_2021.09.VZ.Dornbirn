package Rauan.Woche9.Equal;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Equale {
    public static void main(String[] args) {
        Person person = new Person("Rauan");
        Person person1= new Person("Rauan");
        System.out.println("Person ist gleich Person1 "+ person.equals(person1));
        System.out.println(person);

        List<Person> Pesons = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a person Name");
        for (int i = 0; i <4 ; i++) {
            Person newperson = new Person(scanner.next());
            if (Pesons.contains(newperson)){
                System.out.println("already asists");
            }
            else { Pesons.add(newperson);

            }
            System.out.println(Pesons);
        }
    }
}


