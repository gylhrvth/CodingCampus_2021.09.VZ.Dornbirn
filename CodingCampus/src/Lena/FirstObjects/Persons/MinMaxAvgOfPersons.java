package Lena.FirstObjects.Persons;

public class MinMaxAvgOfPersons {

    private double minHigh;
    private double maxHigh;
    private double minWight;
    private double maxWight;
    private  int minAge;
    private  int maxAge;
    private double avgHigh;
    private double avgWight;
    private double avgAge;

    public MinMaxAvgOfPersons(double minHigh, double maxHigh, double minWight, double maxWight,
                              int minAge, int maxAge, double avgHigh, double avgWight, double avgAge){

        setMinHigh(minHigh);
        setMaxHigh(maxHigh);
        setMaxWight(maxWight);
        setMinWight(minWight);
        setMaxAge(maxAge);
        setMinAge(minAge);
        setAvgAge(avgAge);
        setAvgHigh(avgHigh);
        setAvgWight(avgWight);
    }

    public double getAvgHigh() {
        return avgHigh;
    }

    public void setAvgHigh(double avgHigh) {
        this.avgHigh = avgHigh;
    }

    public double getAvgWight() {
        return avgWight;
    }

    public void setAvgWight(double avgWight) {
        this.avgWight = avgWight;
    }

    public double getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(double avgAge) {
        this.avgAge = avgAge;
    }

    public double getMinHigh() {
        return minHigh;
    }

    public void setMinHigh(double minHigh) {
        this.minHigh = minHigh;
    }

    public double getMaxHigh() {
        return maxHigh;
    }

    public void setMaxHigh(double maxHigh) {
        this.maxHigh = maxHigh;
    }

    public double getMinWight() {
        return minWight;
    }

    public void setMinWight(double minWight) {
        this.minWight = minWight;
    }

    public double getMaxWight() {
        return maxWight;
    }

    public void setMaxWight(double maxWight) {
        this.maxWight = maxWight;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return "MinMaxAvgOfPersons{" +
                "minHigh=" + minHigh +
                ", maxHigh=" + maxHigh +
                ", minWight=" + minWight +
                ", maxWight=" + maxWight +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", avgHigh=" + avgHigh +
                ", avgWight=" + avgWight +
                ", avgAge=" + avgAge +
                '}';
    }
}
