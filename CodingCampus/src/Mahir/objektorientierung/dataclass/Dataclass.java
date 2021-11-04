package Mahir.objektorientierung.dataclass;

public class Dataclass {
    private int min;
    private int max;
    private double avrg;


    public Dataclass(int min, int max, double avrg) {
        this.min = min;
        this.max = max;
        this.avrg = avrg;
    }


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvrg() {
        return avrg;
    }

    public String toString() {
        return String.format("Minvalue: %d Maxvalue: %d Average: %.2f", min, max, avrg);
    }
}
