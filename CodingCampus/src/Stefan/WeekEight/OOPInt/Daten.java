package Stefan.WeekEight.OOPInt;

public class Daten {

    private int min;
    private int max;
    private double durch;

    public Daten(int min, int max, double durch) {
        this.min = min;
        this.max = max;
        this.durch = durch;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getDurch() {
        return durch;
    }

    public String toString() {
        return String.format("Kleinste Zahl: %d, Grösste Zahl: %d, Durchschnitt: %.2f", min, max, durch);
    }
}
