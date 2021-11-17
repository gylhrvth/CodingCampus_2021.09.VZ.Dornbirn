package Lena.FirstObjects.Geometry;

public class Triangle extends Geometry {

    private double a;
    private double b;
    private double c;

    private double alpha;
    private double beta;
    private double gamma;

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        calculateAlpha();
        calculateBeta();
        gamma = 180 - alpha - beta;

    }

    @Override
    public double getCircumference() {
        double high = getHigh();
        return (this.a * high) / 2;
    }

    @Override
    public double getArea() {
        return (a+b+c);
    }
    public double calculateAlpha() {
        this.alpha = Math.toDegrees(Math.acos((-0.5 * (a * a) + 0.5 * (b * b) + 0.5 * (c * c)) / (b * c)));
        return alpha;

    }
    public double getHigh(){
        return this.b * Math.sin(Math.toRadians(this.gamma));
    }

    public double calculateBeta() {
        this.beta = Math.toDegrees(Math.acos((0.5 * (a * a) - 0.5 * (b * b) + 0.5 * (c * c)) / (a * c)));
        return beta;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
