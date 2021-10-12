package Saadaq.Week4;

import Sandro.Programme.ArraysUebungVonLukas;

import java.util.Locale;
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {


        String toAnalyze1 = Lukas.week4.day4.Aufgabe1.TEXT_TO_ANALYZE;
        String toAnalyze2 = Lukas.week4.day4.Aufgabe1.TEXT_TO_ANALYSE_2;
        String toAnalyze3 = Lukas.week4.day4.Aufgabe1.TEXT_TO_ANALYSE_3;
        String toAnalyze4 = Lukas.week4.day4.Aufgabe1.TEXT_TO_ANALYSE_4;

        System.out.println(toAnalyze1.split(" "));

        String testString = "Hello My Friend How can you learn with out really practising the internet thing!";

        int StringTestLenth = testString.length();


        System.out.println("The length is like this:.....StringTestLenth    "+StringTestLenth);





        // count words all words

        wordsCount(toAnalyze1);
        System.out.println();

        // Zähle alle Zeilen

        counLines(toAnalyze2);
        System.out.println();
        // Replace any space "------"
        replace2Strings(toAnalyze1,"Freisebad","_________");
        System.out.println();


       // Replace every place of "ist" und " durch;

        replaceWithRegex(toAnalyze1,"[Ii]st[Uu]nd|[Oo]der","____");
        System.out.println();
        //Create a program which reads in words from the user, which should be replaced by a ___

        //replaceWithScanner(toAnalyze1);
        //System.out.println();



        // Count each character in the text and report its frequency
        // Also output the frequency in percent in relation to the total length of the text
        System.out.println("this counts the special char!___________________");
        countSpecialchars(toAnalyze2);
        System.out.println();




















        /*
         * <h1>Textanalyse</h1>
         *
         * <br>Verschiedene Aufgaben zur Stringmanipulation und Analyse.
         *
         *
         *
         *
         * <br>Verwende dazu die Konstante TEXT_TO_ANALYSE dieser Klasse als Ausgangspunkt.
         *

         * <br><strong>Arbeite wo du es als sinnvoll erachtest mit "lower case"</strong>
         *
         *
         * <br><strong>Verwende für alles nötige und sinnvolle eigene Methoden! Mindestens für jede Aufgabe eine eigene.</strong>
         * <br><strong>Mach die Methoden nun private, nicht mehr public.</strong>
         * <ol>
         *    <li>Zähle alle Wörter und gib diese aus.</li>
         *
         *    <li>Zähle alle Zeilen und gib diese aus.</li>
         *    <li>Ersetze jedes Freisebad durch ___ und gib den Text aus</li>
         *    <li>Ersetze jedes "ist, und, oder" durch ___ und gib den Text aus, verwende dazu einen Regulären Ausdruck</li>
         *    <li>Erstelle ein Programm welches vom Benutzer Worte einliest, die durch ein ___ ersetzt werden sollen und gib den Text aus.
         *    <br>Die Eingabe soll einzeilig erfolgen, z.b.: Haus,Maus,raus
         *    </li>
         *    <li>Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus.
         *    <br>Weiters gib die Häufigkeit in Prozent in relation zur Gesamtlänge des Textes aus.
         *    <li>Siehe 6), beschränke dich aber nun auf das Alphabet</li>
         *    <li>Verwende Aufgaben 5) und 6) und analysiere ebenfalls TEXT_TO_ANALYSE_2,TEXT_TO_ANALYSE_3,TEXT_TO_ANALYSE_4
         *    <br>Gibt es einen unterschied zwischen den deutschen und den englischen Texten?
         *    </li>
         * </ol>

         */


    } // end of main

    public static void allStirngAsks() {
        String text = Lukas.week4.day4.Aufgabe1.TEXT_TO_ANALYZE;

        System.out.println(wordsCount(text));
        System.out.println();


    }



    public static int wordsCount(String text) {
        System.out.println("the text has " + text.split(" ").length + " words");

        return 0;


    }

    public static void counLines(String text){
        System.out.println("The text has "+ (text.split("\\n" ).length /2+1) +"lines");
    }

    public static void replace2Strings (String text, String toReplace, String place){
        System.out.println("All "+ toReplace + " are replaced with "+ place);
        System.out.println(text.replace(toReplace, place));

    }


    public static void replaceWithRegex(String text, String toReplace, String place){
        System.out.println("All "+ toReplace+ " are replaced with " + place);
        System.out.println(text.replace(toReplace, place));
    }

   public static void replaceWithScanner(String text){
        System.out.println("\u001B[36m]" + "write what you want to replace with \"___\""+ "\u001B[0m");
        char[] letters = text.toLowerCase(Locale.ROOT).toCharArray();
       System.out.println();
       replace2Strings(text, scanner(), "___");








   }

   private  static String scanner(){
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       String text = scanner.nextLine();
       return text;

   }

   public static void countSpecialchars(String text){
        char[]csc = text.toCharArray();
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;

        for(int i=0; i< csc.length;i++) {

            if(csc[i] == '.'){
                counter++;
            }
            if ( csc[i] == '-'){
                counter2++;

            }
            if (csc[i] == ','){

            }
                counter2++;


       }
   }


   public static void String(String text){

   }













    }// end of Class

