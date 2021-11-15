package Rauan.woche8.DataKlasse;

public class datenKlasse {
    private int min;
    private int max;
    private double avg;

    public void MinMAxAvg(int min, int max, double avg) {
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
    public String toString (){return String.format("MinValue %d MaxValue %d Average %.2f", min,max,avg);}
}

