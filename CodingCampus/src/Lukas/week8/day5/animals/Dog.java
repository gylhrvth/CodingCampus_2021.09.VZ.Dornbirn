package Lukas.week8.day5.animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("I like bones :-)");
    }

    public void bark() {
        System.out.println("I can bark!!!");
    }
}
