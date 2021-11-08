package Plamena.week8.dataCalc;

public class MinMaxAvrg {
    private final int min;
    private final int max;
    private final float avrg;

    public MinMaxAvrg(int min, int max, float avrg) {
        this.min = min;
        this.max = max;
        this.avrg = avrg;
    }

    public float getAvrg() {
        return avrg;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public String toString() {
        return String.format("Minimum: %d, maximum: %d, average: %.2f", min, max, avrg);
    }
}
