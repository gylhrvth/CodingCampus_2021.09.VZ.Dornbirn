package Lena.FirstObjects.Persons;

public class Person {

    private String name;
    private int age;
    private double wight;
    private double height;

    public Person (String name, double height, int age, double wight){
        setName(name);
        setHeight(height);
        setAge(age);
        setWight(wight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Age below zero is not possible..");
        }
        this.age = age;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        if(wight<0){
            throw new IllegalArgumentException("Wight below zero is not possible..");
        }
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            throw new IllegalArgumentException("Hight below zero is not possible..");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                ", height=" + height +
                '}';
    }


}
