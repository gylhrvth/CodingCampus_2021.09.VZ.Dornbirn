package Mahir.objektorientierung.geometry;

public class Circle extends Geometry{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double getCircumference() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r,2);
    }
}
