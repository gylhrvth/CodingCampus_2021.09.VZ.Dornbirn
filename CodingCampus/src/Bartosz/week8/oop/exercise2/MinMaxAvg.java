package Bartosz.week8.oop.exercise2;

public class MinMaxAvg {
    private int min;
    private int max;
    private double avg;
    private String minPerson;
    private String maxPerson;

    public MinMaxAvg(int min, int max, double avg, String minPerson, String maxPerson) {
        this.min = min;
        this.max = max;
        this.avg = avg;
        this.minPerson = minPerson;
        this.maxPerson = maxPerson;
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
    public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getMinPerson() {
        return minPerson;
    }
    public void setMinPerson(String minPerson) {
        this.minPerson = minPerson;
    }
    public String getMaxPerson() {
        return maxPerson;
    }
    public void setMaxPerson(String maxPerson) {
        this.maxPerson = maxPerson;
    }

    @Override
    public String toString() {
        return String.format("Minvalue: %d-%s  Maxvalue: %d-%s  Average: %.2f", min, minPerson ,max , maxPerson, avg);
    }
}
