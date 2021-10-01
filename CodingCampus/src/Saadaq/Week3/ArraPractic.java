package Saadaq.Week3;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class ArraPractic {


    public static void main(String[] args) {


        //Leichte Aufgabe zum Aufwärmen


        //Eine Zeile aus der Kommandozeile einlesen


        //Zeile ausgeben


        //Zeile in Character Array verwandeln


        //Variante a) Direkt umgedreht ausgeben


        //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben


        //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
        //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben


        // a
        String line = scanner();
        System.out.println(line);
        char[] letters = line.toCharArray();


        //  b
        System.out.println();
        System.out.println(reverseString(letters));


        // variante c


        System.out.println(reversedChar(letters));


        // d
        System.out.println("_______________");
        reverseStringInPlaces(letters);
        System.out.println("=============");


      //  reverseStringInPlace();
        //System.out.println(letters);


    }


    //public static String reverseStringInPlace(char[]letters)  {

      //  for (int i =letters.length -1; i <=0 ; i--) {
        //    System.out.println(letters[i]);

        //}


        //int num1;

    //}


    public static String reversedChar(char[] localLetters) {

        char[] tmp = new char[localLetters.length];
        int counter = 0;

        for (int i = localLetters.length - 1; i >= 0; i--) {

            tmp[counter] = localLetters[i];
            counter++;


        }
        return new String(tmp);

    }


    public static String reverseString(char[] localString) {

        String tmp = "";

        for (int i = localString.length - 1; i >= 0; i--) {

            tmp += localString[i];


        }
        return tmp;


    }


    public static void reverse(char[] localLetters) {
        for (int i = localLetters.length - 1; i >= 0; i--)
            System.out.print(localLetters[i]);


    }


    public static String scanner() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();


    }

    public static void reverseStringInPlaces(char[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;


        }
        System.out.println(array);


    }
}
