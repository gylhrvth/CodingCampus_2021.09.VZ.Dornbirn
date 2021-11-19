package Stefan.Week10.GeometryAbstactClass;

public class Square extends Geometry{

    private double a;

    public Square(double a) {
        this.a = a;

    }

    @Override
    public double getCircumference() {
        return Math.pow(a,2);
    }

    @Override
    public double getArea() {
        return a * 4;
    }
}
