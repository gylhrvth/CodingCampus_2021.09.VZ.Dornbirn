package Eray.week8.geometry;

public class Rectangle extends Geometry {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircumference() {
        return a + b + a + b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

}
