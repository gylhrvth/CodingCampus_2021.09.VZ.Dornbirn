package Rauan.woche8;

public class personen {

    private String name;
    private int age;
    private double weight;
    private double height;
    private int min;
    private int max;
    private double avg;

    public void personen(String name, int age, double weight, double height,int min, int max, double avg) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
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
        if (age < 0) {
            throw new IllegalArgumentException("age below zero isn't possible");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight below zero isn't possible");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height below zero isn't possible");
        }
        this.height = height;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }

    @Override
    public String toString(){return String.format("Name %s Age %d Wight %.2f Height %.2f MinValue %d MaxValue %d" +
                    " Avg %.2f"
            ,name,age,weight,height);}
}
