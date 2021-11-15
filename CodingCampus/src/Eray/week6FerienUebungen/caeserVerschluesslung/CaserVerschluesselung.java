package Eray.week6FerienUebungen.caeserVerschluesslung;

import javax.print.DocFlavor;
import java.util.Arrays;

public class CaserVerschluesselung {

    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {

        String text = "VikfivxwVypi~6465";
        String text2 = "Zmojmz|{";

        //String encryptedText = encrypt(text, 4);
        for (int i = 0; i <200 ; i++) {


            String decryptedText = decrypt(text, i);
            String decryptedText2 = decrypt(text2, i);

            // System.out.println(encryptedText);

            System.out.println("Login: " + decryptedText2);
            System.out.println("Passwort: " + decryptedText);
            System.out.println();
        }

        //Login:     Regberts
        //Passwort:  RegbertsRulez2021

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
