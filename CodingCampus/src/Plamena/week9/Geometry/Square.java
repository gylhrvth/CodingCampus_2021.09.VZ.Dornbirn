package Plamena.week9.Geometry;

public class Square extends Geometry{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getCircumference() {
        return sideLength * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}
