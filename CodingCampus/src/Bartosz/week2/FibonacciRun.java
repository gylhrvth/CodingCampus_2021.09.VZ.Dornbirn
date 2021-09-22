package Bartosz.week2;

import Bartosz.week2.ShortMethods.FibonacciCalc;

import java.util.Scanner;

public class FibonacciRun {
    public static void main(String[] args) {
        System.out.println("Wie oft soll ausgeführt werden?");
        Scanner number1Scanner = new Scanner(System.in);
        int repeat = number1Scanner.nextInt();

        FibonacciCalc.printFibonacci(repeat);
    }
}
