package Danny.classes.abstractCalss.taskGeometry;

public class Circle extends Geometry {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        double circum = Math.PI * 2 * radius;
        return circum;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (radius*radius);
        return area;
    }
}
