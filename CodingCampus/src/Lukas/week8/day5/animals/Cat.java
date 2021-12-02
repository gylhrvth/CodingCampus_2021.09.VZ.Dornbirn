package Lukas.week8.day5.animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("I am a cat I like mice :-)");
    }

    public void miau() {
        System.out.println("I can miau...");
    }
}
