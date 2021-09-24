package Plamena.week2;


public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(7));


        }
    public static int factorial (int factor) {

        return  factor >= 1 ? factor * factorial(factor-1) : 1;
    }
}
