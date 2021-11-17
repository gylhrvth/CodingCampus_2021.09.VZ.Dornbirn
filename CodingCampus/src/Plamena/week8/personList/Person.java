package Plamena.week8.personList;

public class Person {
    private int height;
    private int age;
    private String name;
    private int weight;


    public Person(int height, int age, String name, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }


    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person: " + name + ", age: " + age + ", height: " + height + ", weight: " + weight + System.lineSeparator();
    }
}


