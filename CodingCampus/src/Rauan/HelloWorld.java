package Rauan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie ein satz ein");
        String input = scanner.nextLine();

        while (input.isEmpty()){
            System.out.println("try again");
            input= scanner.nextLine();
        }
        System.out.println("wie oft soll die satz wiederholen");
        while (!scanner.hasNextLine()){
            System.out.println("try again");
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            System.out.println(input);

        }
    }
}





