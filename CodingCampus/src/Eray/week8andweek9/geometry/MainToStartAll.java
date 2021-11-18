package Eray.week8andweek9.geometry;

import java.util.ArrayList;
import java.util.List;

public class MainToStartAll {
    public static void main(String[] args) {
        printAll();
    }

    public static void printAll(){
        Geometry circle = new Circle(5);

        Geometry square = new Square(5);

        Geometry triangle = new Triangle(5,5,8);

        Geometry rectangle = new Rectangle(5,10);

        List<Geometry> geometryFigures = new ArrayList<>();
        geometryFigures.add(circle);
        geometryFigures.add(square);
        geometryFigures.add(triangle);
        geometryFigures.add(rectangle);

        for (Geometry figures : geometryFigures){
            System.out.println(figures.getArea());
            System.out.println(figures.getCircumference());
            System.out.println();

        }



    }

}
