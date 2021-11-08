package Mahir.objektorientierung.person;

public class PersonGetMinMaxAvg {
    private Person min;
    private Person max;
    private double avg;

    public PersonGetMinMaxAvg(Person min, Person max, double avg) {
        this.min = min;
        this.max = max;
        this.avg = avg;
    }

    public Person getMin() {
        return min;
    }

    public Person getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }
    @Override
    public String toString() {
        return String.format("Minvalue: %s\nMaxvalue: %s\nAverage: %.2f", min, max, avg);
    }
}
