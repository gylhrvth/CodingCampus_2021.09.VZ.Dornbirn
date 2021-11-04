package Lukas.week8.day3.explenation;

public class MinMaxDurch {

    private double maxAge;
    private double minAge;
    private double maxHight;
    private double minHight;
    private double maxWeight;
    private double minWeight;
    private double durchAge;
    private double durchWeight;
    private double durchHight;

    public MinMaxDurch(double maxAge, double minAge, double maxHight, double minHight, double maxWeight, double minWeight, double durchAge, double durchWeight, double durchHight) {
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.maxHight = maxHight;
        this.minHight = minHight;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.durchAge = durchAge;
        this.durchWeight = durchWeight;
        this.durchHight = durchHight;
    }

    public double getMaxAge() {
        return maxAge;
    }

    public double getMinAge() {
        return minAge;
    }

    public double getMaxHight() {
        return maxHight;
    }

    public double getMinHight() {
        return minHight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getDurchAge() {
        return durchAge;
    }

    public double getDurchWeight() {
        return durchWeight;
    }

    public double getDurchHight() {
        return durchHight;
    }

    @Override
    public String toString() {
        return String.format("Max age: %13s\nMin age: %13s\nMax height: %10s\nMin height: %10s\nMax weight: %10s\nMin weight: %10s\nSchnitt age: %9s\nSchnitt weight: %7s\nSchnitt hight: %8s",
                this.maxAge, this.minAge, this.maxHight, this.minHight, this.maxWeight, this.minWeight, this.durchAge, this.durchWeight, this.durchHight);
    }

}
