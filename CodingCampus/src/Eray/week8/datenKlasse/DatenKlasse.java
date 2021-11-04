package Eray.week8.datenKlasse;

public class DatenKlasse {

    private int maxValue = 0;
    private int lowestValue = 0;
    private double average = 0;



    public String toString() {
        return String.format("Der Minimum Wert ist: %s  Der Maximum Wert ist: %d Der DurchschnittsWert ist: %s", this.lowestValue, this.maxValue, this.average);
    }

    public DatenKlasse(int lowestValue,int maxValue, double average){
        this.lowestValue = lowestValue;
        this.maxValue = maxValue;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public int getLowestValue() {
        return lowestValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
