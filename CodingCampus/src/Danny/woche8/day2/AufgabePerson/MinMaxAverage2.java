package Danny.woche8.day2.AufgabePerson;

public class MinMaxAverage2 {
    private final int min;
    private final int max;
    private final double avg;

    public MinMaxAverage2(int min, int max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }

    public int getMin() { return min; }

    public int getMax() { return max; }

    public double getAvg() { return avg; }

    @Override
    public String toString() { return String.format("Minvalue: %d Maxvalue: %d Average; %.2f",min,max,avg);}
}
