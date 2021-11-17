package Danny.classes.abstractCalss.taskGeometry;

public abstract class Geometry {
    private String name;

    public Geometry(String name) {
        this.name = name;
    }

    public abstract double getCircumference();

    public abstract double getArea();

    public String getName() {
        return name;
    }
}
