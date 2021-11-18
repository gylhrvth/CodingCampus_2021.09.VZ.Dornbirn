package Bartosz.oop.training.basics;

public class MinMaxAvgAge {
    private int min;
    private int max;
    private double avg;

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


    public void MinMaxAvgAge(int min, int max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }
}
