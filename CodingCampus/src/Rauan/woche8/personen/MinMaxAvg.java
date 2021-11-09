package Rauan.woche8.personen;

public class MinMaxAvg {
    private int min;
    private  int max;
    private double avg;

    public MinMaxAvg(int min, int max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }
    @Override
    public String toString (){return String.format("Min %d Max %d Avg %.2f",min,max,avg);}
}
