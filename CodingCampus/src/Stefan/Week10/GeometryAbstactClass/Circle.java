package Stefan.Week10.GeometryAbstactClass;

public class Circle extends Geometry {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    //Math.pow heist Zahl hoch einer Zahl
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
