package Ingo.week7.day4;

public class Person {

    private double height;
    private int age;
    private String name;
    private double weight;
    private char gender;

    public Person(double height, int age, String name, double weight, char gender) {

        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return String.format("Name: %s,", name);

    }
}
