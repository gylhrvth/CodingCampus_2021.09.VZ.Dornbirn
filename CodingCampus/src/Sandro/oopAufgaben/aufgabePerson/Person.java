package Sandro.oopAufgaben.aufgabePerson;

import java.util.LinkedList;

class Person {

    // Variablen für erste Methode (String name, int age, int heightCm, int weight)
    private String name;
    private int age;
    private int heightCm;
    private int weight;

    // Variablen für zweite (überladene) Methode (double avg, int smallest, int tallest, int ageYoungest, int ageOldest, int lowestWeight, int highestWeight)
    private double avg;
    private int min;
    private int max;
    private String angabe;
    private String bezeichnung;


    public Person(String name, int age, int heightCm, int weight) {
        this.name = name;
        this.age = age;
        this.heightCm = heightCm;
        this.weight = weight;
    }

    public Person(double avg, int min, int max, String angabe, String bezeichnung) {
        this.avg = avg;
        this.min = min;
        this.max = max;
        this.angabe = angabe;
        this.bezeichnung = bezeichnung;
    }



     /*    public String toString() {
           return String.format("Name: %s Alter: %d Größe: %d Gewicht: %d \n", this.name, this.age, this.heightCm, this.weight);
           }
      */

    public String toString() {
        System.out.println("\n" + angabe);
        return String.format("\n Durchschnitt: %.2f " + bezeichnung + "\n Minimum aller Personen: %d " + bezeichnung + "\n Maximum aller Personen: %d " + bezeichnung,
                this.avg, this.min, this.max);
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
        this.age = age;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

