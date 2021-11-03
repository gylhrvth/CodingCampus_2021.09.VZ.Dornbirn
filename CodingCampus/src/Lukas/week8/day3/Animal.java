package Lukas.week8.day3;

public class Animal extends java.lang.Object {
    private String name;
    private int age;
    private String type;

    /**
     * Konstruktor
     *
     * @param name
     * @param age
     * @param type
     */
    public Animal(String name, int age, String type) {
        this.name = name;
        this.setAge(age);
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Throws a {@link RuntimeException} if the provided age is below zero. Don't do that!!!
     *
     * @param age Age of the animal
     */
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Provided age is invalid...");
        }
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.type);
    }
}
