package Plamena.week9.Geometry;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Geometry> geometricFigures = new LinkedList<>();
        geometricFigures.add(new Triangle(1.0, 2.0, 3.0));
        geometricFigures.add(new Square(2.0));
        geometricFigures.add(new Circle(5.0));

        System.out.println(getCircumferenceOverall(geometricFigures));
        System.out.println(getAreaOverall(geometricFigures));
        printCircumferenceAndAreaOverall(geometricFigures);


        System.out.println(geometricFigures.get(1).getArea());
    }


    protected static double getCircumferenceOverall(List<Geometry> geometryFigures) {
        double circumferenceOverall = 0;
        for (Geometry geometryFigure : geometryFigures) {
            if (geometryFigure != null) {
                circumferenceOverall += geometryFigure.getCircumference();
            }
        }
        return circumferenceOverall;
    }

    protected static double getAreaOverall(List<Geometry> geometricFigures) {
        double areaOverall = 0;
        for (Geometry figure : geometricFigures) {
            if (figure != null) {
                areaOverall += figure.getArea();
            }
        }
        return areaOverall;
    }

    public static void printCircumferenceAndAreaOverall(List<Geometry> figures){
        double circumferenceOverall = 0;
        double areaOverall = 0;

        for (Geometry figure : figures) {
            if(figure != null){
                circumferenceOverall += figure.getCircumference();
                areaOverall += figure.getArea();
            }
        }
        System.out.println("Overall circumference of all figures added to the list is: " + circumferenceOverall);
        System.out.println("Overall are of all figures added to the list is: " + areaOverall);
    }

}


