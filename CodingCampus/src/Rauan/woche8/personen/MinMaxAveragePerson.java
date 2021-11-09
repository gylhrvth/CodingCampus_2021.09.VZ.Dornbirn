package Rauan.woche8.personen;

public class MinMaxAveragePerson {

    private double minHigh;
    private double maxHigh;
    private double minWight;
    private double maxWight;
    private int minAge;
    private int maxAge;
    private double avgHigh;
    private double avgWight;
    private double avgAge;



    public  MinMaxAveragePerson(double minHigh, double maxHigh, double minWight, double maxWight,
                          int minAge, int maxAge, double avgHigh, double avgWight, double avgAge) {


        this.minHigh = minHigh;
        this.maxHigh = maxHigh;
        this.minWight = minWight;
        this.maxWight = maxWight;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.avgHigh = avgHigh;
        this.avgWight = avgWight;
        this.avgAge = avgAge;
    }

    public double getMinHigh() {
        return minHigh;
    }

    public double getMaxHigh() {
        return maxHigh;
    }

    public double getMinWight() {
        return minWight;
    }

    public double getMaxWight() {
        return maxWight;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public double getAvgHigh() {
        return avgHigh;
    }

    public double getAvgWight() {
        return avgWight;
    }

    public double getAvgAge() {
        return avgAge;
    }
    @Override
    public String toString ()
    {return String.format("minHeight %.2f maxHeight %.2f minWeight %.2f maxWeight %.2f minAge %d maxAge %d" +
            "avgHeight %.2f avgWeight %.2f avg Age %.2f", minHigh,maxHigh,minWight,maxWight,minAge,maxAge,avgHigh,avgWight,avgAge);}
}


