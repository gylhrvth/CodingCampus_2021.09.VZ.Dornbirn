package Mahir.objektorientierung.geometry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GeometryMain {
    public static void main(String[] args) {
        List<Geometry> geometries = createGeometrics(20);

        Geometry triangle = new Triangle(15);
        Geometry square = new Square(15);
        Geometry circle = new Circle(10);
        Geometry rectangle = new Rectangle(10, 20);


        System.out.println("Area of the Triangle: " + triangle.getArea() + " Circumference of the Triangle: " + triangle.getCircumference());
        System.out.println("Area of the Squkare: " + square.getArea() + " Circumference of the Square: " + square.getCircumference());
        System.out.printf("Area of the Circle: %.2f Circumference of the Circle: %.2f\n", circle.getArea(), circle.getCircumference());
        System.out.println("Area of the Rectangle: " + rectangle.getArea() + " Circumference of the Rectangle: " + rectangle.getCircumference());

    }

    public static List<Geometry> createGeometrics(int number) {
        Random random = new Random();

        List<Geometry> geometries = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (Math.random() <= 0.5) {
                geometries.add(new Rectangle(random.nextInt(45) + 5, random.nextInt(45) + 5));
                geometries.add(new Circle(random.nextInt(45) + 5));
            } else if (Math.random() <= 0.5) {
                geometries.add(new Square(random.nextInt(45) + 5));
                geometries.add(new Triangle(random.nextInt(45) + 5));
            }
        }
        return geometries;
    }
}
