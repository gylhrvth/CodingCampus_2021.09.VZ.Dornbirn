package Ingo.week9;

public class Methoden {

    public static void main(String[] args) {

        System.out.println(doSomething(88, 88));
        doSomething1(88, 88);
        System.out.println(doSomething(88, 88, 88));
        System.out.println(doSomething(88, 88));
        System.out.println(calc(10.88, 10.88));
        System.out.println(getRandomNum(10, 1));

    }

    public static int doSomething(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int doSomething(int number1, int number2, int number3) {
        int result = number1 + number2 + number3;
        return result;
    }

    public static void doSomething1(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }

    public static double calc(double num1, double num2) {
        return num1 * num2 / 10;
    }

    public static int getRandomNum(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }


}

