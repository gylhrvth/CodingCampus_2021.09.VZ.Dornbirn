package Lena;

public class Recursion {

    public static void main(String[] args) {

        fibonacciNumbers(0, 1);

        System.out.println(factorBerechnung(20));

        System.out.println(crazySunAndProduct(10));


    }



    public static int fibonacciNumbers(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
        if (result >= 200) {
            return result;
        }
        fibonacciNumbers(number2, result);

        return result;
    }

    public static long factorBerechnung(long factor) {

        if (factor == 1) {
            return 1;
        }
        return factor * (factorBerechnung(factor - 1));
    }

    public static void printfactor(long factor){
        System.out.println(factorBerechnung(factor));
    }

    public static long factorIterativ(long factor) {
        long erg = 1;

        for (long i = 1; i <= factor; i++) {
            erg = erg * i;
        }

        return erg;
    }

    public static int crazySunAndProduct(int upperBorder) {


        return ((crazyAddition(upperBorder / 2) + (crazyMulti(upperBorder / 2))));
    }

    public static int crazyAddition(int firstHalf) {
        return firstHalf == 0 ? 0 : firstHalf * crazyAddition(firstHalf - 1);
    }

    public static int crazyMulti(int secondHalf) {
        return secondHalf == 1 ? 1 : secondHalf + crazyMulti(secondHalf - 1);
    }


}
