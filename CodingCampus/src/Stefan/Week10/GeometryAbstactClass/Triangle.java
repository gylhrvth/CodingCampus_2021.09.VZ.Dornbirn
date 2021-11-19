package Stefan.Week10.GeometryAbstactClass;

public class Triangle extends Geometry {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return (Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4);
    }
}
