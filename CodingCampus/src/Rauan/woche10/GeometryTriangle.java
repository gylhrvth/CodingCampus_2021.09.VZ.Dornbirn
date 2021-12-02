package Rauan.woche10;

public class GeometryTriangle {

    public static void Run() {
        double a = 5;
        double h = a;
        double b = 10;
        double angleC = 90;

        double pythagoras = pythagorastheorem(a, b);
        System.out.println("pythagorasTheorem: " + pythagoras);

        double c = pythagoras;
        double perimeter = perimeter(a, b, c);
        System.out.println("perimeter: " + perimeter);

        double area1 = areaWithoutAngle(b, h);
        System.out.println("areaWithoutAngle:" + area1);

        double area2 = areaWithAngle(a, b, angleC);
        System.out.println("areaWithAngle: " + area2);
    }


    static double pythagorastheorem(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    static double areaWithoutAngle(double base_b, double height_h) {
        return (1.0 / 2.0) * base_b * height_h;
    }

    static double areaWithAngle(double a, double b, double angleC) {
        return (1.0 / 2.0) * a * b * Math.sin(angleC);
    }
}
