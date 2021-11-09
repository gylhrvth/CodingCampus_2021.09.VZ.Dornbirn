package Mahir.objektorientierung.person;

public class Person {
    private double height;
    private int age;
    private String name;
    private double weight;

    public Person(double height, int age, String name, double weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }


    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Height: %.2f Age: %d Weight: %.2f", name, height, age, weight);
    }
}
