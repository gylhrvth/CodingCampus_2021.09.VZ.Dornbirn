package Danny.classes.abstractCalss.taskGeometry;

public class Circle extends Geometry {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    public double getCircumference(int radius) {
        double circum = Math.PI * 2 * radius;
        return circum;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
