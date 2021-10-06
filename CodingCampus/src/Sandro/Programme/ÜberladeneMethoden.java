package Sandro.Programme;

public class ÜberladeneMethoden {

    public static void main(String[] args) {

        System.out.println(plus(1) + "\n");
        System.out.println(plus(1, 5) + "\n");
        System.out.println(plus(1, 5, 6) + "\n");
        System.out.println(plus(1.45, 5.3) + "\n");
        System.out.println(division(10.0, 2.0) + "\n");
        System.out.println(average(46.0, 2.5) + "\n");

    }

    public static int plus(int a) {
        System.out.println("1. Methode");
        return a += 20;
    }

    public static int plus(int a, int b) {
        System.out.println("2. Methode");
        return a + b;
    }

    public static int plus(int a, int b, int c) {
        System.out.println("3. Methode");
        return a + b + c;
    }

    public static double plus(double a, double b) {
        System.out.println("4. Methode");
        return a + b;
    }

    public static double division(double a, double b) {

        System.out.println("5. Methode");
        return a / b;
    }

    public static double average(double a, double b) {
        System.out.println("6. Methode");
        return (a + b) / 2;

    }
}
