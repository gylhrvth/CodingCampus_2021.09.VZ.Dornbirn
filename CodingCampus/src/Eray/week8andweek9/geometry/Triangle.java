package Eray.week8andweek9.geometry;

public class Triangle extends Geometry {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return ((a) * (b) / 2);
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

}
