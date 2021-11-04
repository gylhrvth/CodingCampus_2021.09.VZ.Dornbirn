package Lukas.week8.day3.explenation;

public class MinMaxDurch {

    private int maxAge;
    private int minAge;
    private int maxHight;
    private int minHight;
    private int maxWeight;
    private int minWeight;
    private int smallest;
    private int biggest;
    private double durch;

    public MinMaxDurch(int maxAge, int minAge, int maxHight, int minHight, int maxWeight, int minWeight, int smallest, int biggest, double durch) {
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.maxHight = maxHight;
        this.minHight = minHight;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.smallest = smallest;
        this.biggest = biggest;
        this.durch = durch;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxHight() {
        return maxHight;
    }

    public int getMinHight() {
        return minHight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getSmallest() {
        return smallest;
    }

    public int getBiggest() {
        return biggest;
    }

    public double getDurch() {
        return durch;
    }

}
