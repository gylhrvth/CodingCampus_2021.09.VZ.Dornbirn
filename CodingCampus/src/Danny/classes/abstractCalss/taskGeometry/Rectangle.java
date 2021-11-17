package Danny.classes.abstractCalss.taskGeometry;

public class Rectangle extends Geometry{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
