package Danny.classes.abstractCalss.taskGeometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryMain {


    public static void main(String[] args) {
        Geometry circle = new Circle(5);
        Geometry square = new Square(5);
        Geometry rectangle = new Rectangle(4,5);
        Geometry triangle = new Triangle(3,4,5);

        List<Geometry> geometry = new ArrayList<>();

        geometry.add(circle);
        geometry.add(square);
        geometry.add(rectangle);
        geometry.add(triangle);




    }

}
