package Danny.classes.abstractCalss.taskGeometry;

public class Rectangle extends Geometry{
    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircumference() {
        double circum = (a + b) * 2;
        return circum;
    }

    @Override
    public double getArea() {
        double area = a * b;
        return area;
    }
}
