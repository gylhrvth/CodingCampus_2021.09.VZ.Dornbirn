package Sandro.oopAufgaben.aufgabePerson;

class Person {

    // Variablen für erste Methode (String name, int age, int heightCm, int weight)
    private String name;
    private int age;
    private int heightCm;
    private int weight;

    // Variablen für zweite (überladene) Methode (double avg, int smallest, int tallest, int ageYoungest, int ageOldest, int lowestWeight, int highestWeight)
    private double avg;
    private int smallest;
    private int tallest;
    private int ageYoungest;
    private int ageOldest;
    private int lowestWeight;
    private int highestWeight;

    public Person(String name, int age, int heightCm, int weight) {
        this.name = name;
        this.age = age;
        this.heightCm = heightCm;
        this.weight = weight;
    }

    public Person(double avg, int smallest, int tallest, int ageYoungest, int ageOldest, int lowestWeight, int highestWeight) {

        this.avg = avg;
        this.smallest = smallest;
        this.tallest = tallest;
        this.ageYoungest = ageYoungest;
        this.ageOldest = ageOldest;
        this.lowestWeight = lowestWeight;
        this.highestWeight = highestWeight;
    }

     /*    public String toString() {
           return String.format("Name: %s Alter: %d Größe: %d Gewicht: %d \n", this.name, this.age, this.heightCm, this.weight);
           }
      */

    public String toString() {
        return String.format("\n Durchschnittsalter aller Personen: %.2f Jahre\n Kleinste: %d cm\n Größte: %d cm\n Jüngste: %d Jahre\n Älteste: %d Jahre\n Leichteste: %d kg\n Schwerste: %d kg\n",
                this.avg, this.smallest, this.tallest, this.ageYoungest, this.ageOldest, this.lowestWeight, this.highestWeight);
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

    public int getAgeYoungest() {
        return ageYoungest;
    }

    public void setAgeYoungest(int ageYoungest) {
        this.ageYoungest = ageYoungest;
    }

    public int getAgeOldest() {
        return ageOldest;
    }

    public void setAgeOldest(int ageOldest) {
        this.ageOldest = ageOldest;
    }
}

