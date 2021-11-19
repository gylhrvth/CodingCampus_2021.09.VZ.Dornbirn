package Danny.classes.abstractCalss.taskGeometry;

public class Rectangle extends Geometry{
    private final int a;
    private final int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircumference() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
