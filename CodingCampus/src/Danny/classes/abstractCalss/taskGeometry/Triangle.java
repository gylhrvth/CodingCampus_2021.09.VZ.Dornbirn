package Danny.classes.abstractCalss.taskGeometry;

public class Triangle extends Geometry{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
