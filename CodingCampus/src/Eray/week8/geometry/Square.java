package Eray.week8.geometry;

public class Square extends Geometry {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getCircumference() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

}
