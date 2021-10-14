package Saadaq.Week4;

import java.util.Arrays;
import java.util.Spliterator;

public class GemischtAufgabe {

    public static String ALL_MEMBERS = "Rauan Mahir Eray Ömer Plamena Sandro Stefan Danny Gerry Ingo Lena Bartosz Sadaaq Stjepan Lukas";

    public static void main(String[] args) {


        //Regbert: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html


        splitAndPrintArray(" ", ALL_MEMBERS);
        splitAndPrintArray("a", ALL_MEMBERS);
        splitAndPrintArray("A-ZÖ", ALL_MEMBERS);
        splitAndPrintArray("[AC]", ALL_MEMBERS);


        String testString = "Danny;Rauan\tMahir.Eray+Ömer+Plamena+Sandro Stefan Gerry Ingo Lena Bartosz Sadaaq Stjepan Lukas";
        splitAndPrintArray("\t", testString);
        splitAndPrintArray(",", testString);
        splitAndPrintArray(",|\t|\\.| ", testString);
        splitAndPrintArray("[;\t\\.\\+ ]", testString);


        // Compare to
        // vergleicht bei mehreren Buchstaben  vom Anfang weg alle Buchstabenm, wenn diese gleich sind dann gehts zum Nächsten!

        String a = "A;";
        String b = "B";
        String c = "C";


        System.out.println("A compare to A: " + a.compareTo(b));
        System.out.println("B compare to B " + b.compareTo(a));
        System.out.print("C compare to A " + c.compareTo("A"));


        // Compare to 2

        String[] membersArray = ALL_MEMBERS.split(" ");
        printMemeberscompareTo(0,12,membersArray);
        printMemeberscompareTo(2,9,membersArray);
        printMemeberscompareTo(5,7,membersArray);

        // anstat intarr[0] > intarr[1]

        if(membersArray[0].compareTo(membersArray[1])> 0) {
            // swap membersArray[0] mit membersArray[1]


        }




        String testString2 = "Hello wie gehts?";

        System.out.println("[" + testString2+"] contain 'a': ");




        // members

        /*
         *
         * <h1>Strings und Arrays</h1>
         *
         * <i>Verwende für folgende Aufgabe die Lukas.week4.day3.Strings.ALL_MEMBERS Variable.</i>
         * Zerlege den String in ein Array.
         * <br>Mach für jede Aufgabe eine eigene Methode<br>
         * <ol>
         *     <li>Sortiere das Array alphabetisch aufsteigend und gib es aus<br><small>verwende compareTo</small></li>
         *     <li>Sortiere das Array alphabetisch absteigend und gib es aus<br><small>verwende compareTo</small></li>
         *     <li>Gib das Element mit den meisten Zeichen aus<br><small>verwende length()</small></li>
         *     <li>Gib das Element mit den wenigsten Zeichen aus<br><small>verwende length()</small></li>
         *     <li>Finde das wort mit den meisten Selbstlauten (a, e, i, o, u), jeder Selbstlaut zählt nur einmal!<br><small>verwende contains</small></li>
         *     <li><strong>BONUS AUFGABE</strong> Finde das wort mit den meisten Selbstlauten (a, e, i, o, u)<br><small>verwende toCharArray()</small></li>
         * </ol>*/


        //


    } // End of Main

    //Sortiere das Array alphabetisch aufsteigend und gib es aus, verwende compareTo
    public static void aufsteigendSort(String[] parameter) {

        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j].compareTo(parameter[j + 1]) > 0) {
                    String tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }

    }


    public static void printMemeberscompareTo(int indexLhs, int indexRhs, String[] arr) {
        System.out.println(arr[indexLhs] + " compreTo " + arr[indexRhs] + ": " + arr[indexLhs].compareTo(arr[indexRhs]));


    }


    // SortAlphabetischAufsteigend(String)

    public static void splitAndPrintArray(String regbert, String text) {

        String[] splitText = text.split(regbert);

        System.out.println("Split by '" + regbert + "'");
        System.out.println(Arrays.toString(splitText));
        System.out.println("A-zO");


    }

} // End of Class
