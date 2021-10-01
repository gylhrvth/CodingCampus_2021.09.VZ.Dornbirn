package Stefan.thirdWeek.Strings;

import java.util.Scanner;

public class AufgabenVonLukas {
    //Leichte Aufgabe zum Aufwärmen
    //Eine Zeile aus der Kommandozeile einlesen
    //Zeile ausgeben
    //Zeile in Character Array verwandeln
    //Variante a) Direkt umgedreht ausgeben
    //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
    //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
    //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Zeile ein");

        String line = readLine();

        System.out.println("Ihre Eingabe war: " + line);

        char[] letters = line.toCharArray();

        //Variante a)
        System.out.println("Variante a)");
        printReverse(letters);

        //Variante b)
        System.out.println("Variante b)");
        //System.out.println(reverseString(letters));
        String output = reverseString(letters);
        System.out.println(output);

        //Variante c)
        System.out.println("Variante c)");
        System.out.println(reverseStringWithNewArray(letters));

        //Variante d)
        System.out.println("Variante d)");
        System.out.println(reverseStringInPlace(letters));
    }

    //T o n i    < length: 4
    //0 1 2 3


    //Variante a)
    public static void printReverse(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }


    //Variante b)
    public static String reverseString(char[] letters) {
        String tmp = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            tmp += letters[i];
        }
        return tmp;
    }


    //Variante c)
    public static String reverseStringWithNewArray(char[] letters) {
        char[] tmp = new char[letters.length];
        int counter = 0;
        for (int i = letters.length -1; i >= 0; i--) {
                tmp[counter] = letters[i];
                counter++;
        }

        String reverseString = new String(tmp);
        return reverseString;
    }


    //Variante d)
    public static String reverseStringInPlace(char[] letters) {
        char tmp;
        int swapper = letters.length - 1;
        for (int i = 0; i < swapper; i++, swapper--) {
            char t = letters[i];
            letters[i] = letters[swapper];
            letters[swapper] = t;
        }


            return new String(letters);

    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
