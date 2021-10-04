package Lukas.week2.day4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solange eine Eingabe einfordern, solange es keine Zahl ist
        System.out.println("Geben Sie eine Zahl ein!!!");
        while (!scanner.hasNextInt()) {
            System.out.println("Geben Sie eine Zahl ein!!!");
            scanner.nextLine();
        }
        int input = scanner.nextInt();
        System.out.println("Sie haben die Zahl " + input + " eingegeben!");
    }
}
