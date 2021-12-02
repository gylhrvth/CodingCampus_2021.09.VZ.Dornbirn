package Danny.classes.abstractCalss.taskGeometry;

public class Circle extends Geometry {

    private final int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius*radius);
    }
}
