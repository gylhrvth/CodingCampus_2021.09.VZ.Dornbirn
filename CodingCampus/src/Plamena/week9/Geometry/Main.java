package Plamena.week9.Geometry;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Geometry> geometricFigures = new LinkedList<>();
        geometricFigures.add(new Triangle(1.0,2.0,3.0));
        geometricFigures.add(new Square(2.0));
        geometricFigures.add(new Circle(5.0));

        System.out.println(geometricFigures.get(2).getCircumference());
        System.out.println();

    }

    public double getCircumferenceOverall(Geometry geometry, Geometry geometry2){
        return geometry.getCircumference() + geometry2.getCircumference();
    }
}


