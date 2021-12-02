package Stefan.Week10.Selbstkontrolle.excercise1;

import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");

        String inputText = scanner.nextLine();
        while (inputText.isEmpty()) {
            System.out.println("Text eingeben");
            inputText = scanner.nextLine();
        }

        System.out.println("Wie oft soll der Text ausgegeben werden:");

        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }

        int inputMenge = scanner.nextInt();
        for (int i = 0; i < inputMenge; i++) {
            System.out.println(inputText);
        }
    }

}
