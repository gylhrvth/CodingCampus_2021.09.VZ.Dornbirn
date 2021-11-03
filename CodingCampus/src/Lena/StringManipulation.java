package Lena;

import Lukas.week4.day4.Aufgabe1;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        String aufgabe = Aufgabe1.TEXT_TO_ANALYSE_2;

        System.out.println(aufgabe.replaceAll("", "_ "));

        System.out.println(getStringToManipulate());

      //  System.out.println(countWords(getStringToManipulate()));
        //System.out.println(countRows(getStringToManipulate()));
        //replaceFreisebad(getStringToManipulate());
        // replaceIstUndOder(getStringToManipulate());
        //    replaceUserWord(getStringToManipulate());
    }

    private static String getStringToManipulate() {

        return Aufgabe1.TEXT_TO_ANALYZE;
    }

    private static String countWords(String string) {


        return "Es sind: " + clearString(string).split(" ").length + " Worte";
    }

    private static String countRows(String string) {
        return "Es sind: " + string.split("\n").length + " Zeilen.";
    }

    private static void replaceFreisebad(String string) {
        System.out.println(string.replaceAll("Freisebad", "___"));
    }

    private static void replaceIstUndOder(String string) {
        System.out.println(string.replaceAll("[Ii]st|[Uu]nd|[Oo]der", "___"));
    }

    private static void replaceUserWord(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib Worte die du ausblenden möchtest mit Beistrich getrennt in einer Zeile ein");
        String userInput = scanner.nextLine();
        userInput = clearString(userInput);
        String[] splitUserInput = userInput.split(" ");
        String regex = "";
        for (int i = 0; i < splitUserInput.length - 1; i++) {
            regex += splitUserInput[i] + " |";
        }
        regex += splitUserInput[splitUserInput.length - 1] + " ";

        System.out.println(regex);

        System.out.println(string.replaceAll(regex, "___ "));


    }


    private static String clearString(String string) {
        String cleardString = string
                .replaceAll("[\\(\\):,]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\\s+", " ");

        return cleardString;
    }

}
