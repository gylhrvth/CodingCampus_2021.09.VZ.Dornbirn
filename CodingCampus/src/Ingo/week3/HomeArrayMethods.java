package Ingo.week3;

import java.util.Scanner;

public class HomeArrayMethods {
    public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingebne: ");
    //    String line = scanner.nextLine();
        String line = readLine();
        System.out.println("deine eingabe war: " + readLine());
        char[] letters = line.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

    }
    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
