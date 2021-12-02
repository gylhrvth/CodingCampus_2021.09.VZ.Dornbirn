package Danny.taskSelbstest.wiederholungAufgabe1Scanner;


import java.util.Scanner;

public class TaskScanner {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");
        String scan = scanner.nextLine();
        do {
            if (scan.isEmpty()) {
                System.out.println("Bitte geben Sie einen Text ein:");
                scan = scanner.nextLine();
            }
        } while (scan.isEmpty());
        System.out.println(scan);



        System.out.println("Wie oft soll der Text ausgegeben werden? " +
                "\nBitte geben Sie eine Zahl ein:");
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte geben Sie eine Zahl ein:");
            scanner.nextLine();
        }
        int z = scanner.nextInt();

        for (int i = 0; i < z; i++) {
            System.out.println(scan);
        }


    }
}


