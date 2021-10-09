package Saadaq.Week4.W3resourceCom;

import java.util.Scanner;

public class W3Resource {

    public static void main(String[] args) {

/*
        // write a program to divide two numbers

        System.out.println(248/65);

        //5 Write a Java programm that takes two numbers as input and displays the product of two numbers


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");

        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber+ " + " + secondNumber + " = " +firstNumber + secondNumber);

        System.out.println("__________________________________________");*/

        // 6 Write a Java program that  sum of (addition), multiply, subtract , divide  and remainder of two numbers.


       /* Scanner scMath = new Scanner(System.in);

        System.out.println("Enter the num1 : ");

        int num1 = scMath.nextInt();

        System.out.println("Enter num2 : ");

        int num2 = scMath.nextInt();

        System.out.println(num1 + " + " + " = " + num2);
*/

        // and all the operations like this.




        // different types of Patterns in Java


        /*int n = 5;


        for (int i=1; i<=5; i++){
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }



              System.out.println();
        }

        System.out.println(":::::::");

        int increasing = 10;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");



            }
            System.out.println();
        }

        System.out.println();

        int decreasing = 5;

        for (int i=1; i<=decreasing; i++){

            for (int j= i; j<=decreasing; j++){
                System.out.print("*");
            }

            System.out.println();
        }*/

        System.out.println("::::::::::");


        int nTriangle = 5;

        for (int i=1; i<=nTriangle; i++)   {
            for (int j=i; j<=nTriangle; j++)  {
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }




































        // print the sum of two numbers






        /*System.out.println(Additions(74, 65));*/










    }// End of Main





     //2
    // Additoin of to numbers Method
    public static int Additions(int a, int b){
        int total = a+b;
        return total;




    }




}// End of Class
