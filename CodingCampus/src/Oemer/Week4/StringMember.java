package Oemer.Week4;


import Lukas.week4.day3.Strings;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class StringMember {
    public static void main(String[] args) {


        System.out.println(Strings.ALL_MEMBERS);

        String[] splitMembers = Strings.ALL_MEMBERS.split(" ");


        alphabetischAufsteigend(splitMembers);
        alphabetischAbsteigend(splitMembers);
        wenigZeichen(splitMembers);
        maxZeichen(splitMembers);
    }


    private static void swap(int indxRhs, int indxLhs, int[] member) {

        int tmp = member[indxRhs];
        member[indxRhs] = member[indxLhs];
        member[indxLhs] = tmp;


    }
    private static void alphabetischAufsteigend(String[] aufsteigend) {
        Collator germanCollator = Collator.getInstance(Locale.GERMANY);
        for (int i = 0; i < aufsteigend.length; i++) {
            for (int j = 0; j < aufsteigend.length - 1; j++) {
                int i1 = germanCollator.compare(aufsteigend[j], aufsteigend[j + 1]);
                if (i1 > 0) {
                    String tmp = aufsteigend[j + 1];
                    aufsteigend[j + 1] = aufsteigend[j];
                    aufsteigend[j] = tmp;
                }


            }

        }
        System.out.println(Arrays.toString(aufsteigend));

    }

    private static void alphabetischAbsteigend(String[] absteigend) {
        for (int i = 0; i < absteigend.length; i++) {
            for (int j = 0; j < absteigend.length - 1; j++) {
                int i1 = absteigend[j].compareTo(absteigend[j + 1]);
                if (i1 < 0) {
                    String tmp = absteigend[j + 1];
                    absteigend[j + 1] = absteigend[j];
                    absteigend[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(absteigend));
    }

    private static void maxZeichen(String[] maxZeichen) {

        System.out.println("das Element mit den meisten Zeichen");
        for (int i = 0; i < maxZeichen.length; i++) {
            for (int j = 0; j < maxZeichen.length - 1 - i; j++) {
                if (maxZeichen[j].length() > maxZeichen[j + 1].length()) {
                    String tmp = maxZeichen[j + 1];
                    maxZeichen[j + 1] = maxZeichen[j];
                    maxZeichen[j] = tmp;

                }

            }

        }
        System.out.println(Arrays.toString(maxZeichen));
    }

    private static void wenigZeichen(String[] wenigZeichen) {

        System.out.println("das Element mit den wenigsten Zeichen");
        for (int i = 0; i < wenigZeichen.length; i++) {
            for (int j = 0; j < wenigZeichen.length - 1 - i; j++) {
                if (wenigZeichen[j].length() < wenigZeichen[j + 1].length()) {
                    String tmp = wenigZeichen[j + 1];
                    wenigZeichen[j + 1] = wenigZeichen[j];
                    wenigZeichen[j] = tmp;

                }

            }

        }
        System.out.println(wenigZeichen[wenigZeichen.length - 1]);
        System.out.println();
    }

}














