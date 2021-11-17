package Danny.classes.abstractCalss.taskGeometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryMain {


    public static void main(String[] args) {
        Geometry circle = new Circle("Circle", 5);
        Geometry square = new Square("Square", 5);
        Geometry rectangle = new Rectangle("Rectangle", 4, 5);
        Geometry triangle = new Triangle("Triangle", 3, 4, 5);

        List<Geometry> geometry = new ArrayList<>();

        geometry.add(circle);
        geometry.add(square);
        geometry.add(rectangle);
        geometry.add(triangle);


        for (Geometry geometryChild : geometry) {
            System.out.printf("Der Umfang von " + geometryChild.getName() + " beträgt: %.2f\n", geometryChild.getCircumference());
            System.out.printf("Der Flächeninhalt von " + geometryChild.getName() + " beträgt: %.2f\n\n", geometryChild.getArea());
        }
    }

}
