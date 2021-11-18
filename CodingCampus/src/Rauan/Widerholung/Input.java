package Rauan.Widerholung;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein satz ein");
        String input = scan.nextLine();

        while (input.isEmpty()){
            System.out.println("try again");
            input = scan.nextLine();
        }
        System.out.println("wie oft soll die satz wiederholen");
        while (!scan.hasNextLine()){
            System.out.println("Try again");
            scan.nextLine();
        }
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(input);

        }
    }
}
