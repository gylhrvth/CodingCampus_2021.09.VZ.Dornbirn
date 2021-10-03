package Rauan.woche3.Array;

import java.util.Scanner;

public class ArrayTest2 {


    public static void main(String[] args) {
        //Leichte Aufgabe zum Aufwärmen
        //Eine Zeile aus der Kommandozeile einlesen
        //Zeile ausgeben
        //Zeile in Character Array verwandeln
        //Variante a) Direkt umgedreht ausgeben
        //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
        //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
        //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben
        //Lukas Array Aufgabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("bitte geben sie ein satz ein");
        String line = scanner.nextLine();
        System.out.println("die satz ist:" + line);
        char[] letters = line.toCharArray();

        //variante A
        System.out.println("variante A");
        printreverse(letters);

        //Variante B
        System.out.println("variante B");
        String output= reverseString(letters);
        System.out.println(output);

        //variante C
        System.out.println("variante C");
        System.out.println(reverseStringWithNewArray(letters));
    }

    public static void printreverse(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }

    public static String reverseString(char[] letters) {
       String tmp="";
       for (int i=letters.length-1; i>=0; i--){
           tmp+= letters[i];
       }
        return tmp;
    }
    public static String reverseStringWithNewArray(char[]letters){
        char[]tmp =new char[letters.length];
        for (int i = letters.length-1; i >=0 ; i--) {
            tmp [i]= letters[i];
        }
        String reverseString = new String(tmp);
        return reverseString;
    }

}
