package Danny.classes.abstractCalss.taskGeometry;

public class Square extends Geometry {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getCircumference() {
        double circum = a * 4;
        return circum;
    }

    @Override
    public double getArea() {
        double area = a * a;
        return area;
    }
}
