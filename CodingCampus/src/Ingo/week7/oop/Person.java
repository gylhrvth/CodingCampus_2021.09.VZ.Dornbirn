package Ingo.week7.oop;

public class Person {

    private double height;
    private int age;
    private String name;
    private double weight;

    Person(double height, int age, String name, double weight) {

        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
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
        return String.format("\nheight: %.2f\n age: %d\n name: %s\n weight %.2f",height,age,name,weight);
    }
    public String toString1() {
        String myString1 = height +"\n"+ age +"\n"+ name +"\n" + weight;
        return myString1;
    }
}

