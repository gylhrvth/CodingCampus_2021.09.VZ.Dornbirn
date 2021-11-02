package Eray.week6FerienUebungen.caeserVerschluesslung;

import javax.print.DocFlavor;
import java.util.Arrays;

public class CaserVerschluesselung {

    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {

        String text = "Hey wie gehts dir?";
        String encryptedText = encrypt(text, 2);
        String decryptedText = decrypt(encryptedText, 2);

        System.out.println(encryptedText);
        System.out.println(decryptedText);
    }

    private static String decrypt(String text, int offset) {
        char[] newText = text.toCharArray();

        for (int i = 0; i < newText.length; i++) {
            newText[i] = (char) ((int) newText[i] - offset);
        }

        String concatenateText = "";

        for (int i = 0; i < newText.length; i++) {
            concatenateText += newText[i];
        }

        return concatenateText;


    }

    private static String encrypt(String text, int offset) {
        char[] newText = text.toCharArray();

        for (int i = 0; i < newText.length; i++) {
            newText[i] = (char) ((int) newText[i] + offset);
        }

        String concatenateText = "";

        for (int i = 0; i < newText.length; i++) {
            concatenateText += newText[i];
        }

        return concatenateText;

    }

}
