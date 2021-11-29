package Mahir.objektorientierung.geometry;

public class Rectangle extends Geometry {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getCircumference() {
        return length * 2 + width * 2;
    }

    @Override
    double getArea() {
        return width * length;
    }
}
