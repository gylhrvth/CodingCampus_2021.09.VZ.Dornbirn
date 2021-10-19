package Eray.week6.uebungsBeispiele;

import java.util.Arrays;

public class StringOperationenReplace {
    public static void main(String[] args) {
        printAll();
    }

    private static void printAll() {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        replaceAll1WirdDurchWarUndIst(text);
        System.out.println();
        replaceAll2LowerChars(text);
        System.out.println();
        replaceAll2UpperChars(text);
        System.out.println();
        replaceAll2Spaces(text);
        System.out.println();
        replaceAll2ExclamationMark(text);


    }



    private static void replaceAll1WirdDurchWarUndIst(String text) {
        text = text.replaceAll("wird", "war und ist");
        System.out.println(text);
    }

    private static void replaceAll2LowerChars(String text) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


        for (int j = 0; j < alphabet.length; j++) {
            text = text.replaceAll(alphabet[j], "");

        }
        System.out.println("Alle klein Buchstaben gelöscht");
        System.out.println(text);
    }

    private static void replaceAll2UpperChars(String text) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "O", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        for (int j = 0; j < alphabet.length; j++) {
            text = text.replaceAll(alphabet[j], "");

        }
        System.out.println("Alle klein Buchstaben gelöscht");
        System.out.println(text);
    }

    private static void replaceAll2Spaces(String text) {
        System.out.println("Alle LeerZeichen gelöscht");
        String newText = text.replaceAll(" ", "");
        System.out.println(newText);
    }

    private static void replaceAll2ExclamationMark(String text) {
        System.out.println("Alle RufeZeichen gelöscht");
        String newText = text.replaceAll("!", "");
        System.out.println(newText);
    }

}
