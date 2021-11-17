package Lena.FirstObjects.Geometry;

public class Circle extends Geometry{

    private double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(this.radius*this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
