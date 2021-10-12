package Stjepan.week4;


import java.util.Arrays;
import Lukas.week4.day4.Aufgabe1;

public class stAufgabenDay4 {

    public static void main(String[] args) {
        String firstText = Aufgabe1.TEXT_TO_ANALYZE;
        String secondText = Aufgabe1.TEXT_TO_ANALYSE_2;
        String thirdText = Aufgabe1.TEXT_TO_ANALYSE_3;
        String fhourthText = Aufgabe1.TEXT_TO_ANALYSE_4;

        System.out.println("TEXT_TO_ANALYZE Ergebnis");
        String firstText1 = firstText;
        String[] words = firstText1.split("[ \\n]");
        String tmp1 = Arrays.toString(words);
        System.out.println();

        String[] firstWords = firstText1.split(" ");
        System.out.println(firstText1);

        //Ersetze jedes Freisebad durch ___
        System.out.println();
        String correctInput = firstText1.replaceAll("Freisebad", "_________");
        System.out.println(correctInput);


        //Ersetze jedes ist, und oder durch ___

        System.out.println();
        String correctInput1 = firstText1.replaceAll("Ist|und|oder", "_____");
        System.out.println(correctInput1);

        //Zählt alle Buchstaben und gibt sie aus.

        String neu = firstText1.toLowerCase();
        char[] character = neu.toCharArray();
        int[] counter = new int[26];
        System.out.println("gezählte buchstaben");
        for (int i = 0; i < character.length; i++) {
            char myChar = character[i];
            int indexOfCounter = myChar - 97;
            if (indexOfCounter >= 0 && indexOfCounter < counter.length) {
                counter[indexOfCounter]++;
            }


        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0)
                System.out.print(("[" + (char) (i + 97)) + "]" + "=" + counter[i] + ",");

        }

    }}