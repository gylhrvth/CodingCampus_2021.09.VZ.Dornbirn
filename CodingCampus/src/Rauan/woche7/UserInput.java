package Rauan.woche7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Zahl");

        while (scanner.hasNextLine()) {
            System.out.println("Bitte geben Sie ein richtige Zahl ");
            scanner.nextLine();
        }
        int num =scanner.nextInt();
        System.out.println("Du wird "+ num+ " eingeben");


       /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie ein zahl ein");
        String input = scan.nextLine();

        while (input.isEmpty()) {
            System.out.println("try again");
            input = scan.nextLine();
        }
        System.out.println("wie oft soll die zahl eingeben");
        while (!scan.hasNextLine()) {
            System.out.println("try again");
            scan.nextLine();
        }
        int num =scan.nextInt();
        for (int i = 0; i <num ; i++) {
            System.out.println(input);

        }

        */
    }

}
