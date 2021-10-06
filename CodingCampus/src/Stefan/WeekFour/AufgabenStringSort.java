package Stefan.WeekFour;


import Lukas.week4.day3.Strings;

import java.util.Arrays;


public class AufgabenStringSort {


    public static void main(String[] args) {

        String[] initArray = Strings.ALL_MEMBERS.split(" ");

        System.out.println("Aufsteigend Sortiert: ");
        aufsteigendSort(initArray);
        System.out.println(Arrays.toString(initArray));
        System.out.println();

        System.out.println("Absteigend Sortiert: ");
        absteigenSort(initArray);
        System.out.println(Arrays.toString(initArray));
        System.out.println();

        System.out.println("Wort mit den meisten Zeichen: ");
        mostStrings(initArray);
        System.out.println(initArray[initArray.length-1]);
        System.out.println();

        System.out.println("Wort mit den wenigsten Zeichen: ");
        smalestStrings(initArray);
        System.out.println(initArray[initArray.length-1]);

    }


    //Sortiere das Array alphabetisch aufsteigend und gib es aus, verwende compareTo
    public static void aufsteigendSort (String[] parameter) {

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


    //Sortiere das Array alphabetisch absteigend und gib es aus, verwende compareTo
    public static void absteigenSort (String[] parameter) {

        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j].compareTo(parameter[j + 1]) < 0) {
                    String tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }

    }


    //Gib das Element mit den meisten Zeichen aus, verwende length()
    public static void mostStrings (String[] parameter) {

        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j].length() > (parameter[j + 1].length())) {
                    String tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }

    }


    //Gib das Element mit den wenigsten Zeichen aus, verwende length()
    public static void smalestStrings (String[] parameter) {

        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter.length - i - 1; j++) {
                if (parameter[j].length() < (parameter[j + 1].length())) {
                    String tempo = parameter[j];
                    parameter[j] = parameter[j + 1];
                    parameter[j + 1] = tempo;
                }
            }
        }

    }

}
