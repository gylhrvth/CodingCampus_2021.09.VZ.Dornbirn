package Bartosz.week2.ShortMethods;

public class FibonacciCalc {
    public static int printFibonacci(int repeat) {
           int result = 0;
        for (int counter = 1;  counter <= repeat; counter++) {
            result = result + (repeat - counter);
        }
        return result;
    }
}
