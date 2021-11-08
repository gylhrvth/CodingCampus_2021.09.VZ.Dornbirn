package Rauan.woche8;

public class MaxMinAveragePersonen {

    private int minAge;
    private int maxAge;
    private double minWeight;
    private double maxWeight;
    private double minHeight;
    private double maxHeight;
    private double avgAge;
    private double avgWeight;
    private double avgHeight;

    public MaxMinAveragePersonen(int minAge, int maxAge, double minWeight){
        this.minAge =minAge;
        this.maxAge =maxAge;
        this.minWeight = minWeight;
        this.maxWeight =maxWeight;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.avgAge =avgAge;
        this.avgWeight =avgWeight;
        this.avgHeight = avgHeight;
    }

    public int getMinAge() {return minAge;}

    public int getMaxAge() {return maxAge;}

    public double getMinWeight() {return minWeight;}

    public double getMaxWeight() {return maxWeight;}

    public double getMinHeight() {return minHeight;}

    public double getMaxHeight() {return maxHeight;}

    public double getAvgAge() {return avgAge;}

    public double getAvgWeight() {return avgWeight;}

    public double getAvgHeight() {return avgHeight;}

    @Override
    public String toString(){return String.format("MinAge %d MaxAge %d MinWeight %.2f MaxWeight %.2f" +
            " MinHeight %.2f AvgAge %.2f AvgWeight %.2f AvgHeight %.2f", minAge,maxAge,minWeight,maxWeight
    ,minHeight,maxHeight,avgAge,avgWeight,avgHeight);}
}

