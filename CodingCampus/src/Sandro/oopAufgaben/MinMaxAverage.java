package Sandro.oopAufgaben;

public class MinMaxAverage {


    public int min;
    public int max;
    public double avg;

    public MinMaxAverage(int min, int max, double avg) {

        this.min = min;
        this.max = max;
        this.avg = avg;

    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public String toString() {
        return String.format("Min: %d Max: %d Avg: %.2f", min, max, avg);

    }
}
