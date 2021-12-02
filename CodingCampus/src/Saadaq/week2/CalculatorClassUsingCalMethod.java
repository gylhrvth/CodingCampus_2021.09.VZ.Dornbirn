package Saadaq.weekTwo;


import Danny.Woche1.Calculator;

import java.util.Scanner;

public class CalculatorClassUsingCalMethod {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter first number");

        int num1 = input.nextInt();

        System.out.println("Please enter second number");

        int num2 = input.nextInt();
        input.nextLine();

        System.out.println("please Enter the operator sign");


        String operation = input.nextLine();



        double result = CalculatorMethod.swichTest(num1,num2, operation);
        System.out.println(result);







    }
}
