package Bartosz.week8.oop.exercise2;

import Bartosz.week8.oop.exercise2.MenuOptions;
import java.util.ArrayList;

public class Init {
    public static void main(String[] args) {
        Person person1 = new Person(30,75, 180, "Ross");
        Person person2 = new Person(32,73, 176, "Ted");
        Person person3 = new Person(35,77, 193, "Marshall");


        getAge(friends(person1, person2, person3));
    }

    private static ArrayList<Person> friends(Person f1, Person f2, Person f3){
        ArrayList<Person> myFriends = new ArrayList<Person>();
        myFriends.add(f1);
        myFriends.add(f2);
        myFriends.add(f3);
        return myFriends;
    }

    private static void getAge(ArrayList<Person> friends){
        int min = friends.get(0).getAge();
        int max = friends.get(0).getAge();
        int sum = 0;

        for (Person friend : friends) {     // für jede Person in friends
            // get youngest
            if(friends.get(0).getAge() > friend.getAge()) {
                min = friend.getAge();
            }
            // get oldest
            if(friends.get(0).getAge() < friend.getAge()) {
                max = friend.getAge();
            }
            sum += friend.getAge();
        }
        int avg = sum / friends.size();  // get average
    }

}
