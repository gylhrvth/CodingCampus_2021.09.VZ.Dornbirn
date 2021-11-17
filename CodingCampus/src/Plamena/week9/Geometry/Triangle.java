package Plamena.week9.Geometry;

public class Triangle extends Geometry {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public double getCircumference() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        return (sideC * (Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)))) / 2;
    }
}
