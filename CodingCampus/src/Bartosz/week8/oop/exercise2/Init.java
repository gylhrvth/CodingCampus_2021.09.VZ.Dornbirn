package Bartosz.week8.oop.exercise2;

import java.util.ArrayList;

public class Init {
    public static void main(String[] args) {
        Person person1 = new Person(34, 75, 160, "Ross");
        Person person2 = new Person(32, 73, 150, "Ted");
        Person person3 = new Person(35, 90, 193, "Marshall");
        Person person4 = new Person(33, 71, 163, "Luke");


        printMinMaxAvg(friends(person1, person2, person3, person4));
    }

    private static ArrayList<Person> friends(Person f1, Person f2, Person f3, Person f4) {
        ArrayList<Person> myFriends = new ArrayList<Person>();
        myFriends.add(f1);
        myFriends.add(f2);
        myFriends.add(f3);
        myFriends.add(f4);
        return myFriends;
    }

    private static void printMinMaxAvg(ArrayList<Person> friends) {
        //-----------------------Age-------------------------------\\
        int min = friends.get(0).getAge();
        int max = friends.get(0).getAge();
        int sum = 0;
        String minPerson = "";
        String maxPerson = "";

        for (Person friend : friends) {     // für jede Person in friends
            // get youngest
            if (min > friend.getAge()) {
                min = friend.getAge();
                minPerson = friend.getName();
            }
            // get oldest
            if (max <= friend.getAge()) {
                max = friend.getAge();
                maxPerson = friend.getName();
            }
            sum += friend.getAge();
        }
        double avg = sum / (double)friends.size();  // get average

        MinMaxAvg mmaAge = new MinMaxAvg(min, max, avg, minPerson, maxPerson);
        System.out.println("Age: " + mmaAge.toString());

        //-----------------------Height-------------------------------\\
        min = friends.get(0).getHeight();
        max = friends.get(0).getHeight();
        sum = 0;


        for (Person friend : friends) {     // für jede Person in friends
            // get tallest
            if (min >= friend.getHeight()) {
                min = friend.getHeight();
                minPerson = friend.getName();
            }
            // get shortest
            if (max <= friend.getHeight()) {
                max = friend.getHeight();
                maxPerson = friend.getName();
            }
            sum += friend.getHeight();
        }
         avg = sum / (double)friends.size();  // get average

        MinMaxAvg mmaHeight = new MinMaxAvg(min, max, avg, minPerson, maxPerson);
        System.out.println("Height: " + mmaHeight.toString());

        //-----------------------Weight-------------------------------\\
        min = friends.get(0).getWeight();
        max = friends.get(0).getWeight();
        sum = 0;

        for (Person friend : friends) {     // für jede Person in friends
            // get lightest
            if (min >= friend.getWeight()) {
                min = friend.getWeight();
                minPerson = friend.getName();
            }
            // get heaviest
            if (max <= friend.getWeight()) {
                max = friend.getWeight();
                maxPerson = friend.getName();
            }
            sum += friend.getWeight();
        }
        avg = sum / (double)friends.size();  // get average

        MinMaxAvg mmaWeight = new MinMaxAvg(min, max, avg, minPerson, maxPerson);
        System.out.println("Weight: " + mmaWeight.toString());

    }

}
