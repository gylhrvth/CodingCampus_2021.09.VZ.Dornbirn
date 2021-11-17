package Danny.classes.abstractCalss.taskGeometry;

public class Triangle extends Geometry{
    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getCircumference() {
        double circum = a + b + c;
        return circum;
    }

    @Override
    public double getArea() {
        //Herons Formel
        double s = getCircumference()/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
