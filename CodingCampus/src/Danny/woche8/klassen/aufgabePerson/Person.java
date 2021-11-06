package Danny.woche8.klassen.aufgabePerson;

public class Person extends java.lang.Object {
    private String name;
    private int size;
    private int age;
    private int weight;

    public Person(String name, int age, int size, int weight) {
        this.name = name;
        this.setAge(age);
        this.setSize(size);
        this.setWeight(weight);
    }
    public void setName(String name) { this.name = name; }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.age = age;
    }

    public void setSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.size = size;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.weight = weight;
    }

    public int getSize() { return size; }

    public int getAge() { return age; }

    public String getName() { return name; }

    public int getWeight() { return weight; }

    @Override
    public String toString() { return String.format("Name: %s Age: %d Size: %d cm Weight: %d kg", this.name, this.age, this.size, this.weight);}

}
