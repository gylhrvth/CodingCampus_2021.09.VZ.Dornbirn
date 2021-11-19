package Danny.classes.abstractCalss.taskGeometry;

public class Square extends Geometry {
    private final int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getCircumference() {
        return a * 4;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
