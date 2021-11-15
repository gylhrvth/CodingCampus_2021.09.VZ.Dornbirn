package Eray.week8.person;

public class PersonenKlasse {

    private final int age;
    private final double height;
    private final String name;
    private final double weight;

    public PersonenKlasse(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Hallo ich heiße %s bin %d Jahre alt, bin %.2f Meter groß und wiege %.2f KiloGramm",name,age,height,weight);
    }
}
