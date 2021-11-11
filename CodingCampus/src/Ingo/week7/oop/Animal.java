package Ingo.week7.oop;

public class Animal {

    String name;
    int age;
    double weight;
    String type;

    Animal(String name,int age, double weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;

    }
    void eat() {
        System.out.println(this.name+ " is eating");
    }
    void drink() {
        System.out.println("Diese Tier ist ein(e) " + this.type);
    }

}
