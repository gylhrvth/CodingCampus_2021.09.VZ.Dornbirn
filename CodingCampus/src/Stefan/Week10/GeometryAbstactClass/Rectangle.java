package Stefan.Week10.GeometryAbstactClass;

public class Rectangle extends Geometry {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircumference() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
