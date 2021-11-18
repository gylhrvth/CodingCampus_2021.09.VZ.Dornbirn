package Plamena.week9.Geometry;

public class Rectangle extends Geometry {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
