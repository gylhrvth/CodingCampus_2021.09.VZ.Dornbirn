package Saadaq.Week3;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUbung {

    public static void main(String[] args) {


        //1)
        //Leichte Aufgabe zum Aufwärmen

        int[] ArrayUbung = new int[5];
        ArrayUbung[0] = 50;
        ArrayUbung[1] = 45;
        ArrayUbung[2] = 35;
        ArrayUbung[3] = 42;
        ArrayUbung[4] = 45;


        System.out.println(Arrays.toString(ArrayUbung));


        //Eine Zeile aus der Kommandozeile einlesen


        Scanner intput = new Scanner(System.in);
        System.out.println("Btte geben sie ein satz ein ");
        //Zeile ausgeben
        String input = intput.nextLine();
        System.out.println("satz ist:" + input);


        //Zeile in Character Array verwandeln und Umdrehen

        char[] CharArray = input.toCharArray();

        for (int myChar : CharArray) {
            System.out.println(myChar);

        }

        System.out.println(CharArray);
        for (int i = CharArray.length - 1; i >0; i--) {

            System.out.println(CharArray[i]);
        }





        //9






        //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
        //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
        //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben


        //2)
        //Text aus Kommandozeile einlesen
        //Buchstaben case insensitive Zählen (A zählt für a)
        //und ausgeben wie oft jeder Buchstabe vorkommt
        //TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen

        //3)
        //Schlaue Menge
        //Lies dir folgendes durch:
        //https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
        //Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
        //erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.
        //Frage jeden Teilnehmer nach seiner Schätzung.
        //Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.













    }// end of the Main














}// end of the Class














