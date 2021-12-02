package Stefan.Week10.GeometryAbstactClass;

public class GeometryMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,8);
        Triangle triangle = new Triangle(11,13,7.6);

        circle.getCircumference();
        System.out.printf("Der Umfang des Kreises ist %.2f \n",circle.getCircumference());
        circle.getArea();
        System.out.printf("Die Fläche des Kreises ist %.2f \n",circle.getArea());

        square.getCircumference();
        System.out.printf("Der Umfang des Quadrates ist %.2f \n", square.getCircumference());
        square.getArea();
        System.out.printf("Die Fläche des Quadrates ist %.2f \n", square.getArea());

        rectangle.getCircumference();
        System.out.printf("Der Umfang des Rechtecks ist %.2f \n", rectangle.getCircumference());
        rectangle.getArea();
        System.out.printf("Die Fläche des Rechtecks ist %.2f \n", rectangle.getArea());

        triangle.getCircumference();
        System.out.printf("Der Umfang des Dreiecks ist %.2f \n", triangle.getCircumference());
        triangle.getArea();
        System.out.printf("Die Fläche des Dreiecks ist %.2f \n", triangle.getArea());
    }
}
