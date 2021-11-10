package Lukas.week8.day5.animals;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("My name is: " + name + " and now I sleep...");
    }

    public void eat() {
        System.out.println("My name is: " + name + " and now I eat...");
    }
}
