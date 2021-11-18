package Danny.classes.abstractCalss.taskGeometry;

public class Triangle extends Geometry{
    private final int a;
    private final int b;
    private final int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
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
        //Herons Formel
        double s = getCircumference()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
