package Ingo.week7.oop;

public class Human {

    private String name;
    private int age;
    private double weight;

    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {

        //System.out.println(this.name+ " is eating!");
    }

    void drink() {
        System.out.println(this.name + " is drinking too much beer, his weight is " + this.weight + " kg !");
    }

    void all() {

        System.out.println(this.name + " has " + this.weight + " kg and is " + this.age + " years old");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
