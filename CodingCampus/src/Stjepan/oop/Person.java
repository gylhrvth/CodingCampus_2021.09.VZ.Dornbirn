package Stjepan.oop;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int weight;
    private int size;
    private String name;
    private int hight;


    public Person(int weight, int size, String name, int hight){
        this.weight = weight;
        this.size = size;
        this.name = name;
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", hight=" + hight +
                '}';
    }
}
