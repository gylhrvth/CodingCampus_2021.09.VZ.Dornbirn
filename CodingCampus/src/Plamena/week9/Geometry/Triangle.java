package Plamena.week9.Geometry;

public class Triangle extends Geometry {
    double sideA;
    double sideB;
    double sideC;

    public Triangle (double sideA, double sideB, double sideC) throws Exception{
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        checkInput();
    }

    public void checkInput () throws Exception{
        if (sideA + sideB < sideC && sideA + sideC < sideB && sideB + sideC < sideA){
            throw new Exception("That is not a triangle! Please try again!");
        }
    }


    @Override
    public double getCircumference() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt((sideA+sideB+sideC)*(sideA+sideB-sideC)*(sideB+sideC-sideA)*(sideC+sideA-sideB))/4;
    }

}
