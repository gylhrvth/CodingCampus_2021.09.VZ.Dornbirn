package Ingo.week7.Methoden;

public class Methode1 {
    public static void main(String[] args) {
        increment(100);
    }

    static void increment(int value) {
        System.out.println(value);
        if (value == 0) {
            return;
        }
        increment(value - 1);
    }

    static double random() {
        return Math.random();
    }

    static double random(double max) {
        return Math.random() * max;
    }

    static double random(double max, double min) {
        return min + Math.random() * (max - min);
    }

    // Optionale Parameters
    static void lines(int len) {
        lines(len, '-');
    }

    static void lines(int len, char c) {
        for (int i = 0; i < len; i++) {
            System.out.print(c);
        }
    }
}
