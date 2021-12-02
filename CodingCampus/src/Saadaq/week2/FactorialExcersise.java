package Saadaq.week2;

import java.util.Scanner;

public class FactorialExcersise {
    public static void main(String[] args) {

        long result = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factrial Consol ");
        System.out.println("If you want to see factorial example type 1 or 0 to see nothing!");
        int inputFactorialChoice = input.nextInt();

        if (inputFactorialChoice == 1) {
            for (int i = 1; i <= 20; i++) {
                result  *= i;

            }
            System.out.println("This is the result of factorial of 20: " + result);
        }else {
            System.out.println("It seams we don't have what to show you based on your choice!");
        }

        return;



    }
}
