package Ingo.week7.testRadio;

public class ProductionDate {

    private int month;
    private int year;

    public int Month() {
        return month;
    }

    public ProductionDate Month(int month) {
        this.month = month;
        return this;
    }

    public int Year() {
        return year;
    }

    public ProductionDate Year(int year) {
        this.year = year;
        return this;
    }


}
