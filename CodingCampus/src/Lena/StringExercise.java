package Lena;


import java.util.Locale;
import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {


        System.out.println(caeserDecryption("Hallo", 1));

    }

    public static void switchChars() {

        //1)
        //Leichte Aufgabe zum Aufwärmen
        //Eine Zeile aus der Kommandozeile einlesen
        //Zeile ausgeben
        //Zeile in Character Array verwandeln und umdrehen
        //Umgedrehte Zeile ausgeben
        Scanner s = new Scanner(System.in);


        System.out.println("Gib ein Wort oder ein Satz ein:");

        String eingabe = s.nextLine();

        char[] helpArray = eingabe.toCharArray();

        char[] switchArray = new char[helpArray.length];

        for (int i = 0; i < helpArray.length; i++) {
            switchArray[helpArray.length - i - 1] = helpArray[i];

        }

        String switchString = new String(switchArray);
        System.out.println(switchString);

    }

    public static void switchChars2() {
        //1)
        //Leichte Aufgabe zum Aufwärmen
        //Eine Zeile aus der Kommandozeile einlesen
        //Zeile ausgeben
        //Zeile in Character Array verwandeln und umdrehen
        //Umgedrehte Zeile ausgeben
        Scanner s = new Scanner(System.in);

        System.out.println("Gib ein Wort oder ein Satz ein:");

        String eingabe = s.nextLine();
        char helpChar;

        char[] switchArray = eingabe.toCharArray();

        for (int i = 0; i < switchArray.length / 2; i++) {
            helpChar = switchArray[i];
            switchArray[i] = switchArray[switchArray.length - i - 1];
            switchArray[switchArray.length - i - 1] = helpChar;
        }

        String switchString = new String(switchArray);
        System.out.println(switchString);

    }

    public static void switchChar3() {
        Scanner s = new Scanner(System.in);

        System.out.println("Gib ein Wort oder ein Satz ein:");

        String eingabe = s.nextLine();
        char[] switchArray = eingabe.toCharArray();
        String ausgabe = "";

        for (int i = switchArray.length - 1; i >= 0; i--) {
            ausgabe += switchArray[i];
        }

        System.out.println(ausgabe);
    }


    public static void countLetters() {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib ein Wort oder ein Satz ein:");

        String eingabe = s.nextLine();
        System.out.println(eingabe);
        eingabe= eingabe.toLowerCase(Locale.ROOT);
        char[] charArray=eingabe.toCharArray();

        int[] lettersCountArray = new int[26];

        for (int i = 0; i < charArray.length; i++) {
            char myChar = charArray[i];
            int index =myChar-97;
            if(index>=0 && index<lettersCountArray.length) {
                lettersCountArray[index]++;
            }
        }

        for (int i = 0; i <lettersCountArray.length; i++) {
            if(lettersCountArray[i]!=0){
                System.out.println((char)(i+97)+" kam "+lettersCountArray[i]+"mal vor");
            }
        }


    }



   public static String caeserDecryption (String string, int key){
        String decryptedString="";

        char[]charArray = string.toUpperCase().toCharArray();

       for (int i = 0; i < charArray.length; i++) {
           charArray[i]=(char)(charArray[i]+key);
       }

       for (int i = 0; i < charArray.length; i++) {
           decryptedString+=charArray[i];
       }

        return decryptedString;

   }



}
